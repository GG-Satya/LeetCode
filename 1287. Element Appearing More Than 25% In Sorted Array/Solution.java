// 1287. Element Appearing More Than 25% In Sorted Array
// ======================================================

class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int target = arr.length / 4;
        for(int key : map.keySet()){
            if(map.get(key) > target) return key;
        }return -1;
    }
}