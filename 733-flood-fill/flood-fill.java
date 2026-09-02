class Solution {
    void dfs(int[][] image,int orginalcolor,int nwcolor,int i,int j){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=orginalcolor || image[i][j]==nwcolor){
            return ;
        }
        image[i][j]=nwcolor;
        dfs(image,orginalcolor,nwcolor,i+1,j);
        dfs(image,orginalcolor,nwcolor,i,j+1);
        dfs(image,orginalcolor,nwcolor,i,j-1);
        dfs(image,orginalcolor,nwcolor,i-1,j);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcol=image[sr][sc];
        dfs(image,orgcol,color,sr,sc);
        return image;
    }
}