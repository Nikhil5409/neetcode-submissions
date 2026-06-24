class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        // element, index
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int need = target-curr;
            if(hm.containsKey(need)){
                ans[0] = hm.get(need);
                ans[1] = i;
                return ans;
            }
            if(!hm.containsKey(curr)){
                hm.put(curr, i);
            }
        }
        return new int[]{0,0};
    }
}
