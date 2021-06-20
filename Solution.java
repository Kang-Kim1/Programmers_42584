import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        int s = scoville.length;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        
        for(int sv : scoville)
            pQueue.offer(sv);
        
        if(pQueue.peek() >= K)
            return answer;
        
        while(pQueue.peek() < K && pQueue.size() > 1) {
            int f1 = pQueue.poll();
            int f2 = pQueue.poll();
            
            int mixed = f1 + (f2 * 2);
            
            pQueue.offer(mixed);
            answer++;
        }

        if(pQueue.peek() < K)
            return -1;
            
        return answer ;
    }
}
