class Solution {
    public int calPoints(String[] operations) {
       Deque<Integer> st = new ArrayDeque<>();
        int sum=0;
        for(String op:operations){
         
       if(op.equals("C")){
            st.pop();
        }
       else if(op.equals("D")){
           int p=st.peek();
           st.push(2*p);
        }
      else if(op.equals("+")){
        int s=st.pop();
        int pp=st.peek();
        st.push(s);
        st.push(s+pp);
        }else{
            st.push(Integer.parseInt(op));
        }
       
        }
        while(!st.isEmpty()){
        sum+=st.pop();
        }
        return sum;
    }
}