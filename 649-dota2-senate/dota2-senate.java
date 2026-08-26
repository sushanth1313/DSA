class Solution {
    public String predictPartyVictory(String senate) {
       Deque<Integer>d=new ArrayDeque<>();
         Deque<Integer>r=new ArrayDeque<>();
         int n=senate.length();
      for(int i=0;i<senate.length();i++){
        if(senate.charAt(i)=='R'){
            r.offer(i);
        }else{
            d.offer(i);
        }
      }
      while(!d.isEmpty() && !r.isEmpty()){
      int  dp=d.poll();
       int rp=r.poll();
        if(dp>rp){
            r.offer(rp+n);
        }else{
            d.offer(dp+n);
        }
      }
      if(d.size()>r.size()){
    return "Dire";
      }else{
        return "Radiant";
      }

    }
}