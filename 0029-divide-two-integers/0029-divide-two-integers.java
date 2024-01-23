class Solution {
    public int divide(int dividend, int divisor) {
        int i=0,ans=0;
        if (dividend == 1 << 31 && divisor == -1) return (1 << 31) - 1;
        int dividendd= Math.abs(dividend),divisorr=Math.abs(divisor);
        while(dividendd-divisorr>=0){
               for(i=0;dividendd-(divisorr <<i<<1)>=0;i++);
               ans += 1<<i;
               dividendd -= divisorr <<i;
        }
        
        return (dividend>0)==(divisor>0) ? ans: -ans;
    }
}