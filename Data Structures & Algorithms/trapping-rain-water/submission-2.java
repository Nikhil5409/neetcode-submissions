class Solution {
    public int trap(int[] height) {
        int totalArea=0;
        //create prefixMax, suffixMax array which containsmax height till that index i
        //prefixMax -> a[i]=maxHeight till [0 -> i] including i
        int n = height.length;
        int[] prefixMax = new int[n];
        prefixMax[0] = height[0];
        for(int i=1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
        }
        //suffixMax -> a[i] = maxHeight from [i -> n-1] including i
        int[] suffixMax = new int[n];
        suffixMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }
        // we have prefix, suffix max array with us
        // now, for every index, take min(prefixMax[i], suffixmax[i])-height[i] to get area
        for(int i=1;i<n-1;i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];
            int area = Math.min(leftMax, rightMax) - height[i];
            totalArea+= area;
        }
        return totalArea;
    }
}



/*  Bruteforce :: O(N^2)
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
*/
