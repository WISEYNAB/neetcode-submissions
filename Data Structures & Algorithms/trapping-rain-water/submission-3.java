class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] leftm = new int[n];
        int[] rightm = new int[n];

        leftm[0] = 0;

        for(int i = 1;i < n;i++){
            leftm[i] = Math.max(leftm[i - 1],h[i-1]);
        }

        rightm[n - 1] = 0;
        for(int i = n - 2;i >= 0;i--){
            rightm[i] = Math.max(rightm[i + 1],h[i+1]);
        }

        int total = 0;

        for(int i = 0;i < n;i++){
            int curr = Math.min(leftm[i],rightm[i]) - h[i];

            total += curr > 0 ? curr : 0;
        }

        return total;
    }
}
