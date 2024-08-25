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
    
    
    public void postorder(TreeNode curroot,List<Integer> res){
        if(curroot==null) return;
        postorder(curroot.left,res);
        postorder(curroot.right,res);
        res.add(curroot.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
}