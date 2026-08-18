class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character>s1=new ArrayDeque<>();
        Deque<Character>t1=new ArrayDeque<>();
       for(char c:s.toCharArray()){
        
        if(c=='#'){
             if(!s1.isEmpty()){
            s1.pop();}
           } else{
                s1.push(c);
            }
       }
        for(char ch:t.toCharArray() ){
      
        if(ch=='#'){
            if(!t1.isEmpty()){
            t1.pop();}
          }  else{
                t1.push(ch);
            }
        }
        if(s1.size()!=t1.size()){
            return false;
        }
        while(!s1.isEmpty()){
        if(s1.pop()!=t1.pop()){
            return false;
        }}
      return true;
        }

       

          } 
             

