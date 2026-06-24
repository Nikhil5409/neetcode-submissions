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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        TreeNode root = build(preorder, inorder, 0, n-1, 0);
        return root;
    }
    TreeNode build(int[] preorder, int[] inorder, int instart, int inend, int prestart){
        if(instart>inend){
            return null;
        }
        int currVal = preorder[prestart];
        TreeNode root = new TreeNode(currVal);
        int idx=searchInorder(inorder, currVal);
        root.left = build(preorder, inorder, instart, idx-1, prestart+1);
        root.right = build(preorder, inorder, idx+1, inend, prestart+(idx-instart)+1);
        return root;
    }
    int searchInorder(int[] inorder, int val){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
}
