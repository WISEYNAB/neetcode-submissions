class KthLargest {
    PriorityQueue<Integer> pq;
    int l;
    public KthLargest(int k, int[] nums) {
        l = k;
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
    }
    
    public int add(int val) {
        int temp = l;
        pq.add(val);
        List<Integer> lis = new ArrayList<>();
        while(temp > 0){
            lis.add(pq.poll());
            temp--;
        }

        for(int i : lis){
            pq.add(i);
        }
        return lis.get(lis.size() - 1);
    }
}
