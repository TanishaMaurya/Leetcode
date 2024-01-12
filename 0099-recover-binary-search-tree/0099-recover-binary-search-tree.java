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
     TreeNode prev=null;
     TreeNode n1;
     TreeNode n2;
    TreeNode n3;
    public void recover(TreeNode root) {
        if(root==null){
            return;
        }
        recover(root.left);
       
        if(prev!=null){
            if(root.val<prev.val){
                if(n1==null){
                    n1=prev;
                    n2=root;
                }
                else{
                    n2=root;
                }
            }
        }
        prev=root;
        recover(root.right);
        
    }
     public void recoverTree(TreeNode root) {
         n1=n2=n3=null;
         prev=new TreeNode(Integer.MIN_VALUE);
         recover(root);
         if(n1 != null && n3!=null){
             int t=n1.val;
             n1.val=n3.val;
             n3.val=t;
         }else if(n1 != null && n2 != null){
             int t=n1.val;
             n1.val=n2.val;
             n2.val=t;
                                        }
     }
}