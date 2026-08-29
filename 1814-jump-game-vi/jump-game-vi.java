class Solution {
    public int maxResult(int[] nums, int k) {
        int[] dp=new int[nums.length];
        Deque<Integer>q=new ArrayDeque<>();
        dp[0]=nums[0];
        q.offerLast(0);
        for(int i=1;i<nums.length;i++){
             while(!q.isEmpty() && q.peekFirst()<i-k){
                q.pollFirst();
            }
        dp[i]=nums[i]+dp[q.peekFirst()];
            while(!q.isEmpty() &&  dp[q.peekLast()]<=dp[i]){
                q.pollLast();
            }
            q.offerLast(i);
           
        }
       return dp[nums.length-1];
        }
 
    }
