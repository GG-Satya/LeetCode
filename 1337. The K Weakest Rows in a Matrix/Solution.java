// 1337. The K Weakest Rows in a Matrix
// ===================================

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(k,(a,b) -> a[1] == b[1] ? a[0]-b[0]:a[1]-b[1]);
	        for(int i=0; i<mat.length; i++){
	            int soldier = 0;
	            for(int man : mat[i]){
	                if(man == 0)break;
	                soldier += man;
	            }
	            pq.offer(new int[] {i,soldier});
	        }
	        int[] ans = new int[k];
	        for(int i=0; i<k; i++) {
	        	ans[i] = pq.poll()[0];
	        }
		return ans;
    }
}