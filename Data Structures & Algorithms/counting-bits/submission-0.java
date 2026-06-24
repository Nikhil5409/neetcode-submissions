class Solution {
    public int[] countBits(int n) {
        int[] setBits = new int[n+1];
        for(int i=0;i<setBits.length;i++){
            setBits[i] = cntSetBits(i);
        }
        return setBits;
    }
    int cntSetBits(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }
}
