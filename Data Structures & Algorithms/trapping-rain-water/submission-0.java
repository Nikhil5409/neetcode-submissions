class Solution {
    public int trap(int[] height) {
        int totalArea=0;
        // boundary building cannot contain any water
        for(int i=1;i<height.length-1;i++){
            //calculate water stored on each building
            //max building on left
            int maxLeft = 0;
            for(int left=0;left<=i;left++){
                maxLeft = Math.max(maxLeft, height[left]);
            }
            int maxRight =0;
            for(int right=i;right<height.length;right++){
                maxRight = Math.max(maxRight, height[right]);
            }
            int hei = Math.min(maxLeft, maxRight);
            int area = (hei-height[i])*1;
            totalArea+=area; 
        }
        return totalArea;
    }
}
