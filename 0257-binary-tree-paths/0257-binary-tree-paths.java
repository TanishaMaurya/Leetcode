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
    private void binaryList(TreeNode root,String path,List<String> res){
        if(root.left==null && root.right==null)
           res.add(path+root.val);
           if(root.left!=null)  
               binaryList(root.left,path+root.val+ "->" ,res);
            if(root.right !=null)
              binaryList(root.right,path+root.val + "->",res);   
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<String>();
        if(root!=null) 
        binaryList(root,"",res);
        return res;
    }
}