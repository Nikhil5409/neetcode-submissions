class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String currS:strs){
            int[] count = new int[26];
            for(char c:currS.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(currS);
        }
        return new ArrayList<>(hm.values());

    }
}
