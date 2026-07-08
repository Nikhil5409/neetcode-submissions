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
    int diameter = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = height(root);
        return diameter;
    }

    int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        int currDia = rightH+leftH +2;
        diameter = Math.max(diameter, currDia);
        return Math.max(leftH, rightH)+1;
    }
}
