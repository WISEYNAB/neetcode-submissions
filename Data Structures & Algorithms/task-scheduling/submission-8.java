class Solution {
    public int leastInterval(char[] tasks, int m) {
        int cycle = 1;

        int n = tasks.length;
        if (m == 0)
            return n;

        int[] freq = new int[26];

        for (char i : tasks) {
            freq[i - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> q = new ArrayDeque<>();

        for (int i : freq) {
            if (i > 0) {
                pq.add(i);
            }
        }

        while (!pq.isEmpty() || !q.isEmpty()) {

            // Release tasks whose cooldown has expired
            if (!q.isEmpty() && q.peek()[1] <= cycle) {
                pq.add(q.poll()[0]);
            }

            if (!pq.isEmpty()) {
                int head = pq.poll();

                if (head > 1) {
                    q.add(new int[]{head - 1, cycle + m + 1});
                }
            }

            cycle++;
        }

        return cycle - 1;
    }
}