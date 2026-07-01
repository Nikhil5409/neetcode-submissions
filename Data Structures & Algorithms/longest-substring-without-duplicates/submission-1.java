class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int left =0;
        int right=0;
        int maxLength=0;
        int len =0;
        while(right<s.length()){
            if(left>right){
                right = left;
            }
            char curr = s.charAt(right);
            if(hm.containsKey(curr)){
                hm.put(s.charAt(left), hm.get(s.charAt(left))-1);
                if(hm.get(s.charAt(left))<=0){
                    hm.remove(s.charAt(left));
                }
                left++;
                continue;
            }
            hm.put(curr,1);
            len = right-left+1;
            maxLength = Math.max(maxLength, len);
            right++;
        }
        return maxLength;
    }
}
