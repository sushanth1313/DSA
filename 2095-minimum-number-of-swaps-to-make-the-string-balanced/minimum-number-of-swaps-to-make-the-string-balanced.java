class Solution {
    public int minSwaps(String s) {
        Deque<Character>st=new ArrayDeque<>();
       for(char c:s.toCharArray()){
        if(c=='['){
            st.push(c);
        }else{
            if(!st.isEmpty()){
            st.pop();
            }
        }
       }
       return ((st.size()+1)/2);

    }
}