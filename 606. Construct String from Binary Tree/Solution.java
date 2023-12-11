// 606. Construct String from Binary Tree
// ======================================

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
    public String tree2str(TreeNode root) {
         StringBuilder res = new StringBuilder();
        dfs(root, res);
        return res.toString();
    }
    public static void dfs(TreeNode root, StringBuilder res) {
        if (root == null)
            return;
        res.append(String.valueOf(root.val));
        if (root.left == null && root.right == null)
            return;
        res.append('(');
        dfs(root.left, res);
        res.append(')');
        if (root.right != null) {
            res.append('(');
            dfs(root.right, res);
            res.append(')');
        }
    }
}