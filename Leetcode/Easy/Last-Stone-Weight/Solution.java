import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];

        PriorityQueue<Integer> ipq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int s : stones){
            ipq.add(s);
        }

        while(ipq.size() > 1){
            int max = ipq.poll();
            int max2 = ipq.poll();

            int remain = max - max2;

            if(remain > 0) ipq.add(remain);
        }

        return ipq.size() == 1 ? ipq.poll() : 0;
    }
}