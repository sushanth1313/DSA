class StockSpanner {
Deque<Integer>st;
int[]prices;
int i;

    public StockSpanner() {
      st=new ArrayDeque<>();
      prices=new int[1000000];
      i=0;
    }
    
    public int next(int price) {
        prices[i]=price;
        while(!st.isEmpty() && prices[st.peek()]<=price){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span=i+1;
        }else{
            span=i-st.peek();
        }
        st.push(i);i++;
        return span;
        }
       
    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */