class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer>st=new ArrayDeque<>();
        int res=0;
      int maxres=0;
        int l[]=new int[heights.length];
       int r[]=new int[heights.length];
       for(int i=heights.length-1;i>=0;i--){
        while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           
        }if(!st.isEmpty()) {
          r[i]=st.peek();
        }else{
            r[i]=heights.length;
        }
     
        st.push(i);
               }
        st.clear();    
       for(int i=0;i<heights.length;i++){
        while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           
        }if(!st.isEmpty()) {
          l[i]=st.peek();
        }else{
            l[i]=-1;
        }
      
        st.push(i);
        
               }
        for(int i=0;i<heights.length;i++){
        res=heights[i]*(r[i]-l[i]-1);
        maxres=Math.max(res,maxres);
       }
               return maxres;
    }
}