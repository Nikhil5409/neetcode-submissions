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
    ArrayList<Integer> al = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        getInorder(root);
        return al.get(k-1);
    }

    void getInorder(TreeNode root){
        if(root==null){
            return;
        }
        getInorder(root.left);
        al.add(root.val);
        getInorder(root.right);
    }
}
