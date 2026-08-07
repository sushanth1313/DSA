class Solution {
    public boolean isPalindrome(String s) {
        String S=s.toLowerCase();
       int n=S.length();
        int j=n-1; for(int i=0;i<S.length();i++){
            while(i<j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
    i++;
}
while(i < j && !Character.isLetterOrDigit(S.charAt(j))){
    j--;
}
if(S.charAt(i)!=S.charAt(j))
    return false;
                if(S.charAt(i)==S.charAt(j)){
                    i++;
                    j--;
                   
                }
            
        }
    }
     return true;
}
}