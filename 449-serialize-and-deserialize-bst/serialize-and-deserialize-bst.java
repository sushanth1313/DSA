/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans=new StringBuilder();
        if(root==null){
            return "";
        }
        preorder(ans,root);
        return ans.toString();
    }
    public void preorder(StringBuilder ans,TreeNode root){
        if(root==null){
            return ;
        }
        ans.append(root.val).append(",");
        preorder(ans,root.left);
        preorder(ans,root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")){
            return null;
        }
      String[] arr=data.split(",");
      int[] index={0};
      return build(arr,index,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    TreeNode build(String[] arr,int[] index,int min,int max){
        if(index[0]>=arr.length){
            return null;
        }
        int val=Integer.parseInt(arr[index[0]]);
        if(val>max || val<min){
            return null ;
        }
        index[0]++;
        TreeNode node=new TreeNode(val);
        node.left=build(arr,index,min,val);
        node.right=build(arr,index,val,max);
        return node;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;