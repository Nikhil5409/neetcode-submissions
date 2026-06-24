class Solution {
    public int reverseBits(int n) {
        int left=31;
        int right =0;
        int ans =0;
        if((n&1)==1){
            ans = ans | (1<<left);
        }
        if((n&(1<<left))!=0){
            ans = ans | 1;
        }
        left--;
        right++;
        while(left>right){
            //left in n input
            if((n&(1<<left)) !=0){
                //make right bit set in ans
                ans = ans | (1<<right);
            }
            if((n&(1<<right)) !=0){
                //make left bit set in ans
                ans = ans | (1<<left);
            }
            left--;
            right++;
        }
        return ans;
        
    }
}
