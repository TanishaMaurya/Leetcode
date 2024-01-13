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
    int maxlevel=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        right(root,1,l);
        return l;
    }
    void right(TreeNode root,int level,List<Integer> l){
        if(root==null){
            return;
        }
        if(maxlevel<level){
            l.add(root.val);
            maxlevel=level;
        }
        right(root.right,level+1,l);
        right(root.left,level+1,l);
    }
}