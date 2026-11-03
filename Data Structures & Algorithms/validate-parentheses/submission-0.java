class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int n = s.length();
        int i = 0;
        while(i < n){
            while(i < n && !st.isEmpty() && equalB(st.peek(),s.charAt(i))){
                st.pop();
                i++;
            }
            if(i < n){
                st.push(s.charAt(i)); 
            }
            i++;
        }

        return st.isEmpty();
    }

    boolean equalB(char a,char b){
        if(a == '[' && b == ']' ||
        a == '{' && b == '}' ||
        a == '(' && b == ')'){
            return true;
        }

        return false;
    }
}
