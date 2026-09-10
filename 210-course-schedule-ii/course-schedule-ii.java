class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph=new ArrayList<>();
        int[] ans=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] pre:prerequisites){
            int course=pre[0];
            int pq=pre[1];
            graph.get(pq).add(course);
            indegree[course]++;
        }
       
        ArrayDeque<Integer>q=new ArrayDeque<>();
        
       for(int i=0;i<numCourses;i++){
       if(indegree[i]==0){
        q.offer(i);
       }}
       int index=0;
       while(!q.isEmpty()){
        int cur=q.poll();
       ans[index++]=cur;
       for(int any:graph.get(cur)){
        indegree[any]--;
        if(indegree[any]==0){
            q.offer(any);
        }
       }
       }
       if(index!=numCourses){
       return new int[0];
       }
       
     return ans;
       }   
   
}