class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Deque<Integer>st=new ArrayDeque<>();
       int ans[]=new int[nums2.length];
       for(int i=nums2.length-1;i>=0;i--){
              while(!st.isEmpty() && st.peek()<nums2[i]){
            st.pop();    
        }
        if(st.isEmpty()){
            ans[i]=-1;
        }
else{
            ans[i]=st.peek();
        }
     st.push(nums2[i]);
      
         }
            Map<Integer,Integer>mp=new HashMap<>();
       
        for(int i=0;i<nums2.length;i++){
 mp.put(nums2[i],ans[i]);
        }
           int[] ansf=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
          ansf[i]= mp.get(nums1[i]);
        }
        return ansf;
       }

       }
      
    
