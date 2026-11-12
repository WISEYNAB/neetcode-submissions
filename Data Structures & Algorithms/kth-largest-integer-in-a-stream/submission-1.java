class KthLargest {
    PriorityQueue<Integer> pq;
    int l;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        l = k;
        for(int i : nums){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);

        if(pq.size() > l){
            pq.poll();
        }

        return pq.peek();
    }
}
