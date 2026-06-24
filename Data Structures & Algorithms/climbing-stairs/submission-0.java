class Solution {
    public int climbStairs(int n) {
        int prevToPrev =1;
        int prev =1;
        int curr=1;
        for(int i=2;i<=n;i++){
            curr = prevToPrev+prev;
            prevToPrev = prev;
            prev = curr;
        }
        return curr;
    }
}
