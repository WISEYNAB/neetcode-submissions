class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (max.isEmpty() || num <= max.peek()) {
            max.add(num);
        } else {
            min.add(num);
        }

        if(max.size() > min.size() + 1){
            min.add(max.poll());
        }

        if(max.size() < min.size()){
            max.add(min.poll());
        }
    }

    public double findMedian() {
        if (max.isEmpty() && min.isEmpty()) {
            return 0.0;
        }
        if (max.size() == min.size()) {
            return (double) (min.peek() + max.peek()) / 2;
        } else if (max.size() > min.size()) {
            return max.peek();
        } else {
            return min.peek();
        }
    }
}