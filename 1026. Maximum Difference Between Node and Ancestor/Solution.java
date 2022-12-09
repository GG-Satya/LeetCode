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

    public int maxAncestorDiff(TreeNode root) {

            return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int min, int max) {

        if (root == null) return max - min;

        max = max > root.val ? max : root.val ;
 
        min = min < root.val ? min : root.val ; 

        return Math.max(dfs(root.left, min, max), dfs(root.right, min, max));
    }
    
}