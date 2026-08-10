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
    public boolean isSymmetric(TreeNode root) {
       return isym(root.left,root.right);

    }
    public boolean isym(TreeNode right,TreeNode left){
        if(right==null && left==null) return true;
        if(right==null || left==null) return false;
        if(right.val!=left.val) return false;
       return isym(right.left,left.right) && isym(right.right,left.left);
       
    }
}