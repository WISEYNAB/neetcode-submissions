class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int n = pos.length;
        int[][] arr = new int[n][2];

        for(int i = 0;i < n ;i++){
            arr[i] = new int[]{pos[i],speed[i]};
        }

        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));


        Stack<int[]> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i = n-2;i >= 0;i--){
            int[] peek = st.peek();
            double t1 = (double)(target - peek[0])/peek[1];
            double t2 = (double)(target - arr[i][0])/arr[i][1];

            if(t1 >= t2){
                continue;
            }

            st.push(arr[i]);
        }

        return st.size();
    }
}
