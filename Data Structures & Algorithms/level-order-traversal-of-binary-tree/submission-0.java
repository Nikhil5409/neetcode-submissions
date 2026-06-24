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
class Pair{
    int level;
    TreeNode node;
    Pair(int level, TreeNode node){
        this.level = level;
        this.node = node;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.add(new Pair(0, root));
        while(!queue.isEmpty()){
            Pair currPair = queue.remove();
            int currLevel = currPair.level;
            TreeNode currNode = currPair.node;
            int currVal = currNode.val;
            if(ans.size()<=currLevel){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(currVal);
                ans.add(temp);
            }else{
                ans.get(currLevel).add(currVal);
            }
            if(currNode.left!=null){
                queue.add(new Pair(currLevel+1, currNode.left));
            }
            if(currNode.right!=null){
                queue.add(new Pair(currLevel+1, currNode.right));
            }
        }
        return ans;
    }
}
