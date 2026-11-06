class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        //push till we get a larger element next as it cant be expaned 
       Stack<int[]> st = new Stack<>();
        //keep a global max which we calculate only while popping
        //st.push(new int[]{h[i],i});
        int max = 0;
        for(int i = 0;i < n;i++){
            //if curr element is greater than the peek
            if(!st.empty() && h[i] > st.peek()[0]){
                st.push(new int[]{h[i],i});
                continue;
            }
            int newind = i;
            while(!st.isEmpty() && h[i] <= st.peek()[0]){
                int hi = st.peek()[0];
                int l = i - st.peek()[1];

                max = Math.max(max,l * hi);
                newind = st.pop()[1];
            }

            st.push(new int[]{h[i],newind});
        }
    
        while(!st.isEmpty()){
            int hi = st.peek()[0];
            int l = n - st.pop()[1];
            max = Math.max(max,l * hi);
        }

        return max;
    }
}
