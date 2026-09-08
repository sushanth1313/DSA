/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
       Map<Node,Node>mp=new HashMap<>();
       Deque<Node>q=new ArrayDeque<>();
       if (node == null)
            return null;
       mp.put(node,new Node(node.val,new ArrayList<>()));
       q.add(node);
       while(!q.isEmpty()){
        Node h=q.poll();
        for(Node neighbors:h.neighbors){
            if(!mp.containsKey(neighbors)){
                 mp.put(neighbors,new Node(neighbors.val,new ArrayList<>()));
                 q.add(neighbors);
            }
        mp.get(h).neighbors.add(mp.get(neighbors));
        }
       }
      return  mp.get(node);
    }
}