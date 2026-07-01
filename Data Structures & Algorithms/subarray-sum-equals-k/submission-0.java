class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int cnt=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                cnt+= hm.get(sum-k);
            }

            if(hm.containsKey(sum)){
                hm.put(sum, hm.get(sum)+1);
            }else{
                hm.put(sum, 1);
            }
        }
        return cnt;
    }
}