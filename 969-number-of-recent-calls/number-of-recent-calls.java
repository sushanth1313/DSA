class RecentCounter {
    Deque<Integer>st;
    public RecentCounter() {
        st=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        st.offer(t);
        while(t-st.peek()>3000){
            st.poll();
        }
        return st.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */