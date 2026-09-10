class Solution {
    public int minSwaps(String s) {
      int op=0;
       for(char c:s.toCharArray()){
        if(c=='['){
           op++;
        }else{
           if(op>0){
            op--;
           }
            }
        }
         return ((op+1)/2);

       }
      
    }
