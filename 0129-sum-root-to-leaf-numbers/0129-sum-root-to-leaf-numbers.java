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
    int ans=0;
    public void dfs(TreeNode root,int vl){
        if(root==null) return;
        
         vl= vl*10 +root.val;
        if(root.left ==null && root.right==null){
            ans+=vl;
        }
        dfs(root.left,vl);
        dfs(root.right,vl);
        // return ans;
    }
    public int sumNumbers(TreeNode root) {
       
       dfs(root,0);
        return ans;
    }
}
