class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<Integer>> map = new HashMap<>();
        int n = strs.length;
        for(int i = 0;i < n;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder(new String(arr));

            map.computeIfAbsent(sb.toString(),k -> new ArrayList<>()).add(i);
        }

        List<List<String>> ans = new ArrayList<>();

        for(String j : map.keySet()){
            List<String> temp = new ArrayList<>();
            List<Integer> index = map.get(j);
            
            for(int i = 0;i < index.size();i++){
                temp.add(strs[index.get(i)]);
            }

            ans.add(temp);
        }

        return ans;
    }
}
