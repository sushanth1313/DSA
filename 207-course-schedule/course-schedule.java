class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] pre:prerequisites){
            int course=pre[0];
            int preq=pre[1];
            graph.get(preq).add(course);
            indegree[course]++;
        }
        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
       
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int any:graph.get(curr)){
                indegree[any]--;
                if(indegree[any]==0){
                q.offer(any);
                }
            }
        }
        return count==numCourses;
    }
}