class Solution {
    public boolean isPalindrome(int x) {
        char[] arr=String.valueOf(x).toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
     
    }
}