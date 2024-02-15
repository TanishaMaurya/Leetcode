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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> hs=new HashSet<>();
        TreeNode c=root;
        while(c!=null){
            if(c.left==null){
                if(hs.contains(k-c.val))return true;
                hs.add(c.val);
                c=c.right;
            }else{
                TreeNode t=c.left;
                while(t.right != null && t.right != c){
                    t=t.right;
                }
                if(t.right==c){
                    t.right=null;
                    c=c.right;
                }else{
                    if(hs.contains(k-c.val))return true;
                    hs.add(c.val);
                    t.right=c;
                    c=c.left;
                }
            }
        }
        return false;
    }
}