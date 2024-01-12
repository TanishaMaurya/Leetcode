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
        if(root== null){
            return root;
}
int c=root.val;
if(c< p.val && c< q.val){
    return lowestCommonAncestor(root.right,p,q);
}if(c> p.val && c> q.val){
    return lowestCommonAncestor(root.left,p,q);

}
return root;

    }
}