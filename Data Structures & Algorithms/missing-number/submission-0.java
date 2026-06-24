class Solution {
    public int missingNumber(int[] nums) {
        int ans =-1;
        for(int i=0;i<=nums.length;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if((i^nums[j])==0){
                    found=true;
                }
            }
            if(!found){
                ans = i;
            }
        }
        return ans;
    }
}
