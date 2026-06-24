class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freqS[ch-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freqT[ch-'a']+=1;
        }
        for(int i=0;i<26;i++){
            if(freqS[i]!=freqT[i]){
                return false;
            }
        }
        return true;
    }
}
/*
if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hmS.put(ch, hmS.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            hmT.put(ch, hmT.getOrDefault(ch, 0)+1);
        }
        for(Character ch:hmS.keySet()){
            if(hmS.get(ch)!=hmT.get(ch)){
                return false;
            }
        }
        return true;
*/