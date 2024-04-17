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
    String ans="";
    public String smallestFromLeaf(TreeNode root) {
        smaller(root,"");
        return ans;
    }
    public void smaller(TreeNode root,String cur){
        if(root==null) return;
        int c= root.val + 'a';
        char k=(char)c;
        cur = k+ cur;
        if( (root.left==null && root.right == null) && (cur.compareTo(ans)<0 || ans.equals(""))){
            ans=cur;
        }
        smaller(root.left,cur);
        smaller(root.right,cur);
    } 
}