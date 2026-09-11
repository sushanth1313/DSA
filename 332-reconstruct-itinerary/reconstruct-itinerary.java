class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>>graph=new HashMap<>();
        for(List<String>ticket:tickets){
            String from=ticket.get(0);
            String to=ticket.get(1);
        if(!graph.containsKey(from)){
            graph.put(from,new PriorityQueue<String>());
        }
        graph.get(from).add(to);
        }
        LinkedList<String>ans=new LinkedList<>();
        dfs("JFK",graph,ans);
        return ans;
    }
    private void dfs(String from,Map<String,PriorityQueue<String>>graph,LinkedList<String>ans){
        PriorityQueue<String>pq=graph.get(from);
        while(pq!=null && !pq.isEmpty()){
            String next=pq.poll();
            dfs(next,graph,ans);
        }
        ans.addFirst(from);
            }
}