class Solution {
    public int shortestSubarray(int[] nums, int k) {
       Deque<Integer>q=new ArrayDeque<>();
       int left=0;
       int[] psum=new int[nums.length+1];
       int ans=nums.length+1;
       for(int i=0;i<nums.length;i++){
        psum[i+1]=psum[i]+nums[i];
       } 
     for(int right=0;right<=nums.length;right++){
       while(!q.isEmpty() && psum[right]-psum[q.peekFirst()]>=k){
         ans=Math.min(ans,right-q.pollFirst());
       }
       while(!q.isEmpty() && psum[q.peekLast()]>psum[right]){
        q.pollLast();
       }
       q.offerLast(right);
     }
       return ans==nums.length+1?-1:ans;
    }
}