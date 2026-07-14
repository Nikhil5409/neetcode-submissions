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
    boolean balanced=true;
    public boolean isBalanced(TreeNode root) {
        int height = height(root);
        return balanced;
    }
    int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            balanced=false;
        }
        return Math.max(leftHeight, rightHeight)+1;
    }
}
