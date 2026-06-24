class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> minHeap = 
            new PriorityQueue<>((a, b) -> hm.get(a) - hm.get(b));
        

        //int[] ans = new int[k];
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            hm.put(curr, hm.getOrDefault(curr, 0)+1);
        }

        for(int val:hm.keySet()){
            minHeap.add(val);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=k-1; i>=0;i--){
            ans[i] = minHeap.poll();
        }
        return ans;

    }
}

