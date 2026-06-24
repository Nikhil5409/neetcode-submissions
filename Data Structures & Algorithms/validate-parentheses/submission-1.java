class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr=='(' || curr=='{' || curr=='['){
                stack.push(curr);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }    
            char stackLast = stack.pop();
            if(stackLast=='(' && curr==')'){
                continue;
            }
            else if(stackLast=='{' && curr=='}'){
                continue;
            }
            else if(stackLast=='[' && curr==']'){
                continue;
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
