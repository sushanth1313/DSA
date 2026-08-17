class Solution {
    public boolean isValid(String s) {
        Stack<Character>ss=new Stack<>();
      for (char st:s.toCharArray()){
        if(st=='['){
            ss.push(']');
        }
        else if(st=='{'){
            ss.push('}');
        }
        else if(st=='('){
            ss.push(')');
        }
        else {
            if(ss.isEmpty() || ss.pop()!=st ){
            return false;
        }
        }
      
      }
         return ss.isEmpty();
    }
    
}