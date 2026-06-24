class Solution {
    public int majorityElement(int[] nums) {
        int majority = -1;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majority = nums[i];
            }
            if(nums[i]==majority){
                count++;
                continue;
            }
            count--;
        }
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majority){
                check++;
            }
        }
        if(check>(nums.length/2)){
            return majority;
        }
        return -1;
    }
}