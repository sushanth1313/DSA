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
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        boolean lefttoright=true;
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=que.poll();
                if(lefttoright){
                level.add(cur.val);}else{
                    level.add(0,cur.val);
                }


                
                  if(cur.left!=null){
                    que.add(cur.left);
                }
                if(cur.right!=null){
                    que.add(cur.right);
                }
            }
            ans.add(level);
            lefttoright=!lefttoright;
        }
return ans;
    }
}