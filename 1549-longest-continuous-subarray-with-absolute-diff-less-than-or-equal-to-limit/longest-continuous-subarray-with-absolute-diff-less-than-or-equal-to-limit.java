class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer>i=new ArrayDeque<>();
        Deque<Integer>d=new ArrayDeque<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            while(!i.isEmpty() && nums[i.peekLast()]>nums[right]){
             i.pollLast();
            }
            i.offerLast(right);
            while(!d.isEmpty() && nums[d.peekLast()]<nums[right]){
             d.pollLast();
            }
            d.offerLast(right);
          while(nums[d.peekFirst()]-nums[i.peekFirst()]>limit){
            if(i.peekFirst()==left){
                i.pollFirst();
            }
            if(d.peekFirst()==left){
                d.pollFirst();
            }
            left++;
          }
          ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}