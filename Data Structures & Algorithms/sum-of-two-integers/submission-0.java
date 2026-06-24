class Solution {
    public int getSum(int a, int b) {
        int ans =0;
        int carry=0;
        for(int i=0;i<32;i++){
            int sum=0;
            int bit=0;
            if((a&(1<<i))!=0){
                sum+=1;
            }
            if((b&(1<<i))!=0){
                sum+=1;
            }
            sum+=carry;
            bit = (sum%2);
            if(bit==1){
                ans = ans | (1<<i);
            }
            carry = sum/2;
        }
        return ans;
        
    }
}
