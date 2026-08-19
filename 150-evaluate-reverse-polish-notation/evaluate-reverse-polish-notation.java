class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer>st=new ArrayDeque<>();
        int p1=0;
        int p2=0;
       
       
        for(String ans:tokens){
           
        if(ans.equals("+")){
            p1=st.pop();
            p2=st.pop();
            p1+=p2;
        
            st.push(p1);
        }else if (ans.equals("*")){
          p1=st.pop();
            p2=st.pop();
            p1*=p2;
            st.push(p1);
        }else if(ans.equals("-")){
              p1=st.pop();
            p2=st.pop();
         st.push(p2-p1);
        }else if (ans.equals("/")){
               p1=st.pop();
            p2=st.pop();
            st.push(p2/p1);
        }
          else{
        st.push(Integer.parseInt(ans));

          }  
        }
      return st.pop();
        }
       
            }
