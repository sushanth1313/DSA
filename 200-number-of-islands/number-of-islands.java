class Solution {
    void dfs(boolean visited[][],char grid[][],int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        
    if(i<0 || j<0 || i>=m || j>=n|| visited[i][j] || grid[i][j]!='1'){
        return;
    }
    visited[i][j]=true;
  dfs(visited,grid,i-1,j);
dfs(visited,grid,i+1,j);
dfs(visited,grid,i,j-1);
    dfs(visited,grid,i,j+1);
    
    }
    public int numIslands(char[][] grid) {
      int count=0;
     int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             if(grid[i][j]=='1' && !visited[i][j]){
                count++;
                dfs(visited,grid,i,j);
             }
            }
        }
        return count;
    }
}