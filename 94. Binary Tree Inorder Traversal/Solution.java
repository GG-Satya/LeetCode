// 94. Binary Tree Inorder Traversal
// =================================

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        return ans;
    }
    private void inOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}