class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] right=new int[n];
        int[]  left=new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        int ans=0;
        for(int i=1;i<left.length;i++){
        left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=right.length-2;i>=0;i--){
        right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(right[i],left[i])-height[i];
        }
        return ans;
    }
}