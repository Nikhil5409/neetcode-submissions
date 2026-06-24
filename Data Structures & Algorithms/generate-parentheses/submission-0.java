class Solution {
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        backtrack(sb, ans, open, close, n);
        return ans;
    }
    void backtrack(StringBuilder sb, List<String> ans, int open, int close, int n){
        if(open==n && close==n){
            String curr = sb.toString();
            ans.add(curr);
            return;
        }
        if(open<n){
            sb.append("(");
            backtrack(sb, ans, open+1, close, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            backtrack(sb, ans, open, close+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
