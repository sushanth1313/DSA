class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int right=0;right<nums.length-1;right++){
            int left=right+1;
           if(nums[right]==target  ){
              return right;
           }
           if(nums[left]==target){
            return left;
           }
           if(nums[right]<target && nums[left]>target){
            return left;
           }
          
        }
         if(nums[nums.length-1]<target){
            return nums.length;
           }
        return 0;
    }
}