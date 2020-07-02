class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(Integer i: stones){
            pq.add(i);
        }
        
        int size = pq.size();
        while(size!=1){
            int max1 = pq.poll();
            int max2 = pq.poll();
            int res = max1-max2;
            pq.add(res);
            size = pq.size();
        }
        
        return pq.peek();
    }
}