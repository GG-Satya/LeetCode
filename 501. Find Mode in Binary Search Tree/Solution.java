// 501. Find Mode in Binary Search Tree
// ====================================


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
    Integer prev;
    int count = 1, max =1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root,list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private void traverse(TreeNode root, List<Integer> list){
        if(root == null)return;
        traverse(root.left,list);
        if(prev != null) count = root.val == prev ? count+1 : 1; 
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        } else if(count == max){
            list.add(root.val);
        }
        prev = root.val; // Update prev here
        traverse(root.right,list);
    }
}