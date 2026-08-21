class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int res=0;
        int maxres=0;
        int[] l=new int[m];
        int[] r=new int[m];
        Deque<Integer>st=new ArrayDeque<>();
        int[] count=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    count[j]++;
                }else{
                    count[j]=0;
                }
            }
            st.clear();
            for(int j=m-1;j>=0;j--){
            while(!st.isEmpty() && count[j]<=count[st.peek()]) {
                st.pop();
            }  if(!st.isEmpty()){
                r[j]=st.peek();
            } else{
                r[j]=m;
            }
              st.push(j);
                }
            st.clear();     
                for(int j=0;j<m;j++){
            while(!st.isEmpty() && count[j]<=count[st.peek()]) {
                st.pop();
            }  if(!st.isEmpty()){
                l[j]=st.peek();
            } else{
                l[j]=-1;
            }
              st.push(j);
                }
            
            for(int j=0;j<m;j++){
             res=count[j]*(r[j]-l[j]-1);
             maxres=Math.max(res,maxres);
            }}
             return maxres;
        }
       

    }
