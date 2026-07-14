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
    public boolean isValidBST(TreeNode root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return valid(root, min, max);
    }
    boolean valid(TreeNode root, int min, int max){
        if(root==null){
            return true;
        }
        if(root.val<min || root.val>max){
            return false;
        }
        return valid(root.left, min, root.val-1) && valid(root.right, root.val+1, max);
    }
}
