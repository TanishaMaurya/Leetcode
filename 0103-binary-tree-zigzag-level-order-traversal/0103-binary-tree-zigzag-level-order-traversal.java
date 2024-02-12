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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> z=new ArrayList<>();
        if(root==null) return z;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            Stack<Integer>reverseSt=new Stack<>();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(flag){
                    reverseSt.add(node.val);
                }else{
                    level.add(node.val);
                }
                
                if(node.left != null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                
            }
            flag=!flag;
            
            //pop all element from stack
            while(!reverseSt.isEmpty())
                level.add(reverseSt.pop());
            
            z.add(level);
        }
        return z;
    }
}