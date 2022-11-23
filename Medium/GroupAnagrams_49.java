class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<String> temp = new ArrayList<String>();
        List<List<String>> result = new ArrayList<List<String>>();

        for(String s:strs) {
            char[] chTemp = s.toCharArray();
            Arrays.sort(chTemp);
            temp.add(String.valueOf(chTemp));
        }

        Map<String, List<String>> indexes = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {

            indexes.computeIfAbsent(temp.get(i) , c -> new ArrayList<>()).add(strs[i]);

        }

        for(String key : indexes.keySet()) {
            result.add(indexes.get(key));
        }

        return result;

    }
}
