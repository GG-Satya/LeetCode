// 103. Binary Tree Zigzag Level Order Traversal
// =============================================

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new LinkedList<>();

        travel(root,list,0);

        return list;
    }
    private void travel(TreeNode root, List<List<Integer>> list, int level){

        if(root == null)return ;

        if(list.size() <= level){

            List<Integer> newLevel = new LinkedList<>();

            list.add(newLevel);
        }
        List<Integer> collection = list.get(level);

        if(level % 2 == 0)collection.add(root.val);

        else collection.add(0,root.val);

        travel(root.left, list, level+1);
        travel(root.right, list, level+1);
    }
}
