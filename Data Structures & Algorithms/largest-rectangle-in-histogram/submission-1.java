class Solution {
    public int largestRectangleArea(int[] heights) {
        //creating nsl, nsr array for input
        int[] nsl = smallerOnLeft(heights);
        int[] nsr = smallerOnRight(heights);
        int maxArea = 0;
        for(int i=0;i<heights.length;i++){
            int width = (nsr[i]-nsl[i]-1);
            int height = heights[i];
            int currArea = height*width;
            maxArea= Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    int[] smallerOnLeft(int[] a){
        int[] ans = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<a.length;i++){
            int curr = a[i];
            while(!stack.isEmpty()){
                if(a[stack.peek()]<curr){
                    ans[i]=stack.peek();
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            stack.add(i);
        }
        return ans;
    }
    int[] smallerOnRight(int[] a){
        int[] ans = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            int curr = a[i];
            while(!stack.isEmpty()){
                if(a[stack.peek()]<curr){
                    ans[i]=stack.peek();
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=a.length;
            }
            stack.add(i);
        }
        return ans;
    }
}
