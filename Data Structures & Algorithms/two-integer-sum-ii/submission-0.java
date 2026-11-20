class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        
        for(int i = 0;i < n;i++){
            int j = n - 1;
            while(j > i){
                if(num[i] + num[j] == target){
                    return new int[]{i + 1,j + 1};
                } else if(num[i] + num[j] > target){
                    j--;
                } else {
                    break;
                }
            }
        }

        return new int[]{};
    }
}
