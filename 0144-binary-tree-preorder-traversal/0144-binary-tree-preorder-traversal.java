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

    public List<Integer> preorder(TreeNode root,List<Integer>a){
         
        if(root !=null){
        int data=root.val;
        a.add(data);
        preorder(root.left,a);
        preorder(root.right,a);
        }
        return a;

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
           return  preorder(root,a);
     
    }
}