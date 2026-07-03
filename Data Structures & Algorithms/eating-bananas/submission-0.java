class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // max possible ans = max of array piles
        // min possible ans = 1
        int start =1;
        int end = max(piles);
        int ans = 1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            boolean pos = isPossible(piles, h, mid);
            if(pos){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    boolean isPossible(int[] a, int hours, int eatingRate){
        int hoursNeeded =0;
        for(int i=0;i<a.length;i++){
            int banana = a[i];
            int temp = banana/eatingRate;
            if(banana%eatingRate>0){
                temp++;
            }
            hoursNeeded+=temp;
        }
        if(hoursNeeded<=hours){
            return true;
        }
        return false;
    }
    int max(int[] piles){
        int max = piles[0];
        for(int i=1;i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }
}
