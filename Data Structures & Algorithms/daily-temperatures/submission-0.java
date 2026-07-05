class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        //ngr
        int[] ngr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]<=curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                ngr[i] = i; 
            }else{
                ngr[i] = stack.peek();
            }
            stack.push(i);
        }

        for(int i=0;i<n;i++){
            int ngrIdx = ngr[i];
            result[i] = ngrIdx-i;
        }
        return result;
    }
}
