class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr = tokens[i];
            if(!(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/"))){
                stack.add(Integer.parseInt(curr));
            }else{
                int val2= stack.pop();
                int val1 = stack.pop();
                int ans=0;
                if(curr.equals("+")){
                    ans = val1+val2;
                }else if(curr.equals("-")){
                    ans = val1-val2;
                }else if(curr.equals("*")){
                    ans = val1*val2;
                }else{
                    ans = val1/val2;
                }
                stack.add(ans);
            }
        }
        return stack.pop();
    }
}
