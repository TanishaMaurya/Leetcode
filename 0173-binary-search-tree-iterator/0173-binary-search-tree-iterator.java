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
class BSTIterator {
    Stack<TreeNode> s;

    public BSTIterator(TreeNode root) {
      s=new Stack<>();
      for(var a=root;a!=null;a=a.left){
          s.push(a);
      }
    }
    
    public int next() {
        var n=s.pop();
        for(var a=n.right;a != null ;a=a.left){
            s.push(a);
        }
        return n.val;
    }
    
    public boolean hasNext() {
      return (!s.isEmpty());
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */