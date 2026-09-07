

class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
    int[][] time=new int[n][m];
    for(int i=0;i<n;i++){
        Arrays.fill(time[i],Integer.MAX_VALUE);
    }
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){   
        if(grid[i][j]==2){
               dfs(grid,time,i,j,0);
                }
            }
        }
        int rqtime=0;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1 ){
            if(time[i][j]==Integer.MAX_VALUE) return -1;
        rqtime=Integer.max(time[i][j],rqtime);
            }
           }}

    return rqtime;
    }
    void dfs(int[][]grid,int[][] time ,int i,int j,int crtime){
       int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>=n|| j>=m || crtime>=time[i][j] || grid[i][j]==0){
            return;
        }
        time[i][j]=crtime;
        dfs(grid,time,i-1,j,crtime+1);
        dfs(grid,time,i,j-1,crtime+1);
        dfs(grid,time,i+1,j,crtime+1);
        dfs(grid,time,i,j+1,crtime+1);
}}

