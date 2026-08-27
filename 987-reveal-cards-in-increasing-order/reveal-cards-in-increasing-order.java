class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer>q=new ArrayDeque<>();
        int[] ans=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        for(int i=0;i<deck.length;i++){
            int pos=q.poll();
            ans[pos]=deck[i];
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}