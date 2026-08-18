class Solution {
    public String removeDuplicates(String ss) {
        Deque<Character>st=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();
        for(char s:ss.toCharArray()){
         
           
            if(!st.isEmpty() && st.peek()==s){
                st.pop();
            }else{
                st.push(s);
            }
      
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}