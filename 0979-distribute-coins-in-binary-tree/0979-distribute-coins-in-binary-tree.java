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
      int r=0;
    public int coins(TreeNode root){
        if(root==null) return 0;
        int l=coins(root.left);
        int ri=coins(root.right);
      r+=Math.abs(l+ri+root.val-1);
        return l+ri+root.val -1;
    }
    
    public int distributeCoins(TreeNode root) {
        r=0;
        coins(root);
        return r;
    }
}

