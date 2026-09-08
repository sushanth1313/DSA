class Solution {
    public int ladderLength(String beginWord, String endWord,   List<String> wordlist) {
    Set<String> words=new HashSet<>(wordlist);
       Queue<String>q=new LinkedList<>();
       q.add(beginWord);
       q.add(null);
       Set<String>s=new HashSet<>();
       s.add(beginWord);
       int level=1;
      
        while(!q.isEmpty()){
        String word=q.poll();
        if(word==null){
            level++;    
        
        if(!q.isEmpty()){
            q.add(null);
        }
        continue;
        }
        if(word.equals(endWord)){
            return level;
        }
        
        for(int i=0;i<word.length();i++){
            char[] newword=word.toCharArray();
            for(char c='a';c<='z';c++){
                 newword[i]=c;
                 String nword=new String(newword);
                 if(words.contains(nword) && !s.contains(nword)){
                    q.add(nword);
                    s.add(nword);
                 }

            }
        }}
        return 0;
    }
}