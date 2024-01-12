/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode ln=lowestCommonAncestor(root.left,p,q);
        TreeNode rn=lowestCommonAncestor(root.right,p,q);
        if(rn == null){
            return ln;
        }
        if(ln == null){
            return rn;
        }
       
            return root;
        
    }
}