class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            push(st,stones[i]);
        }

        while(st.size() > 1){
            int a = 0;
            int b = 0;
            if(!st.isEmpty()){
                a = st.pop();
            }
            if(!st.isEmpty()){
                b = st.pop();
            }
            int newel = 0;
            if(a == b){
                continue;
            } else if(a > b){
                newel = a - b;
            } else {
                newel = b - a;
            }

            push(st,newel);
        }

        return st.isEmpty() ? 0 : st.peek();
    }

    void push(Stack<Integer> st,int x){
        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty() && st.peek() > x){
            temp.push(st.pop());
        }

        st.push(x);

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
}
