class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        s= s.toLowerCase();
        while(start<end){
            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }else if(Character.isLetterOrDigit(s.charAt(start))){
                end--;
            }else{
                start++;
            }
        }
        return true;
    }
}
