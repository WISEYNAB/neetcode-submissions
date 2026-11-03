class Solution {
    public int evalRPN(String[] t) {
        Stack<String> st = new Stack<>();

        int n = t.length;
        
        for(int i = 0;i < n;i++){
            if(t[i].equals("+")){
                int prev = 0,curr = 0;
                if(!st.isEmpty()){
                    curr = Integer.parseInt(st.pop());
                }
                if(!st.isEmpty()){
                    prev = Integer.parseInt(st.pop());
                }

                int newin = prev + curr;

                st.push(newin + "");
            } else if(t[i].equals("-")){
                int prev = 0,curr = 0;
                if(!st.isEmpty()){
                    curr = Integer.parseInt(st.pop());
                }
                if(!st.isEmpty()){
                    prev = Integer.parseInt(st.pop());
                }

                int newin = prev - curr;

                st.push(newin + "");
            } else if(t[i].equals("*")){
                int prev = 0,curr = 0;
                if(!st.isEmpty()){
                    curr = Integer.parseInt(st.pop());
                }
                if(!st.isEmpty()){
                    prev = Integer.parseInt(st.pop());
                }

                int newin = prev * curr;

                st.push(newin + "");
            } else if(t[i].equals("/")){
                int prev = 0,curr = 0;
                if(!st.isEmpty()){
                    curr = Integer.parseInt(st.pop());
                }
                if(!st.isEmpty()){
                    prev = Integer.parseInt(st.pop());
                }

                int newin = (int)(prev / curr);

                st.push(newin + "");
            } else {
                st.push(t[i]);
            }
        }

        return Integer.parseInt(st.peek());
    }
}
