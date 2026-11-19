class Solution {
    public boolean isPalindrome(String s1) {
        String s = s1.toLowerCase();
        int n = s.length();

        int i = 0;
        int j = n - 1;

        while(i < j){
            while(i < n && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(j >= 0 && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(i >= n || j < 0 || i > j){
                return true;
            }


            if(s.charAt(i) != s.charAt(j)){
                return false;
            }


            i++;
            j--;
        }


        return true;
    }
}
