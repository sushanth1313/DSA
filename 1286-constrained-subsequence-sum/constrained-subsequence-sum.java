class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<Integer>q=new ArrayDeque<>();
        int dp[]=new int[nums.length];
        int maxans=nums[0];
        for(int i=0;i<nums.length;i++){
         
            while(!q.isEmpty() && q.peekFirst()<i-k ){
               q.pollFirst();
            }
            if(q.isEmpty()){
                dp[i]=nums[i];
            }else{
                dp[i]=nums[i]+Math.max(0,dp[q.peekFirst()]);
            }
            while(!q.isEmpty() && dp[q.peekLast()]<=dp[i]){
                q.pollLast();
            }
            q.offerLast(i);
            maxans=Math.max(maxans,dp[i]);
        }
        return maxans;
    }
}