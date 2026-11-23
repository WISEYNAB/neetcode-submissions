class Solution {
    public int maxArea(int[] h) {
        int n = h.length;

        int i = 0;
        int j = n - 1;

        int max = 0;

        while(i < j){
            int area = Math.min(h[i],h[j]) * (j - i);
            max = Math.max(max,area);

            if(h[i] >= h[j]){
                j--;
            } else {
                i++;
            }
        }

        return max;
    }
}
