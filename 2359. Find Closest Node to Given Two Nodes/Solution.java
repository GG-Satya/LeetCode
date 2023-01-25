// 2359. Find Closest Node to Given Two Nodes
// ==========================================

// Method 01
// ---------

class Solution {
  public int closestMeetingNode(int[] edge, int node1, int node2) {

    int n= edge.length;

    int[] A= new int[n]; 

    int[] B= new int[n];

    Arrays.fill(A,Integer.MAX_VALUE);

    Arrays.fill(B,Integer.MAX_VALUE);
    
    //call bfs
    bfs(node1,A,edge,n);
    bfs(node2,B,edge,n);
    
    //get node with minimum value of distance
    int res= Integer.MAX_VALUE, node=-1;

    for(int i=0;i<n;i++){

        if(A[i]==Integer.MAX_VALUE || B[i]==Integer.MAX_VALUE) continue;

        if(res>Math.max(A[i],B[i])){

            node=i; 

            res= Math.max(A[i],B[i]);
        }
    }
    return node;
    }

 void bfs(int src, int[] dist,int[] edge,int n){

        Queue<Integer> q= new LinkedList<>();

        q.add(src);

        dist[src]=0;

        while(q.size()>0){

            var p= q.remove();

            if(edge[p]!=-1 && dist[edge[p]]==Integer.MAX_VALUE){

                q.add(edge[p]);

                dist[edge[p]]= dist[p]+1;
            }
        }
    }
}


// Method 02
// ---------

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {

    HashMap<Integer, Integer> vis = new HashMap<>();
 
   for (int i=node1, d=0; i>=0 && !vis.containsKey(i); i=edges[i])
        vis.put(i, d++);

    HashSet<Integer> vis2 = new HashSet<>();

    int res=-1, dist = 0, min=Integer.MAX_VALUE;
    
    for(int i=node2; i>=0 && !vis2.contains(i); i=edges[i]){

        if(vis.containsKey(i)){

            int curr = Math.max(dist, vis.get(i));

            if(res==-1 || curr<=min){

                res = curr==min ? Math.min(res, i) : i;

                min = curr;
            }
        }
        dist++; vis2.add(i);
    }
    return res;
    }
}