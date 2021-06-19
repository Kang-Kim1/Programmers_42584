import java.util.*;

class Solution {
    public class Price {
        private int _p;
        private int _i;
        
        Price(int p, int i) {
            this._p = p;
            this._i = i;
        }
    }
    
    public int[] solution(int[] prices) {
        int[] ret = new int[prices.length];

        Queue<Price> que = new LinkedList<Price>();
        int index = 0;
        int count = 0;
        
        for(int i = 0; i < prices.length; i++) {
            que.offer(new Price(prices[i], i));
        }
        
        Queue<Price> container = new LinkedList<Price>();
        
        
        while(!que.isEmpty()) {
            Price polled = que.poll();
            
            int size = container.size();
            for(int i = 0; i < size; i++) {
                Price temp = container.poll();
                
                if(temp._p <= polled._p) {
                    ret[temp._i]++;
                    container.offer(temp);
                } else {
                    ret[temp._i]++;
                }
                
            }
            container.offer(polled);


        }
        
        return ret;
    }

}
