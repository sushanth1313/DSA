class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character>st=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();
        if(num.length()==k){
         return "0";
        }
        for(char n:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>n && k>0){
                st.pop();
                k--;  
              
            }
            st.push(n);
                
                }
                while(k>0){
                    st.pop();
                    k--;
                }   
          while(!st.isEmpty()){
            ans.append(st.removeLast());
          }
          while(ans.length()>1 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
          }
          return ans.toString();
           
    }
        }
       
    
