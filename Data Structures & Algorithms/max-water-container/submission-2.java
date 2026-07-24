class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int maxWater = 0;
        while(start<end){
            int currWater = 0;
            int width = end-start; 
            int height = (Math.min(heights[start], heights[end]));
            currWater = height*width;
            maxWater = Math.max(maxWater, currWater);
            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
}
