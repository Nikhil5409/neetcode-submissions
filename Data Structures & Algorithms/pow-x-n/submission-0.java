class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n<0){
            return myPow(1/x, -n);
        }
        double val = myPow(x, n/2);
        if(n%2==0){
            return val*val;
        }else{
            return val*val*x;
        }
    }
}
