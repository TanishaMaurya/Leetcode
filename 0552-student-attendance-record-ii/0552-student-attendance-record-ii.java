class Solution {
    public int checkRecord(int n) {
        long MOD = 1000000007;
        long A0_P = 1;
        long A0_L = 1;
        long A0_LL = 0;
        long A1_A = 1;
        long A1_P = 0;
        long A1_L = 0;
        long A1_LL = 0;

        for (int i = 2; i <= n; i++) {
            long _A0_P = A0_P + A0_L + A0_LL;
            long _A0_L = A0_P;
            long _A0_LL = A0_L;
            long _A1_A = A0_L + A0_LL + A0_P;
            long _A1_P = A1_L + A1_LL + A1_A + A1_P;
            long _A1_L = A1_A + A1_P;
            long _A1_LL = A1_L;

            A0_P = _A0_P % MOD;
            A0_L = _A0_L % MOD;
            A0_LL = _A0_LL % MOD;
            A1_A = _A1_A % MOD;
            A1_P = _A1_P % MOD;
            A1_L = _A1_L % MOD;
            A1_LL = _A1_LL % MOD;
        }
        long res = 0;
        res = (res + A0_P) % MOD;
        res = (res + A0_L) % MOD;
        res = (res + A0_LL) % MOD;
        res = (res + A1_A) % MOD;
        res = (res + A1_P) % MOD;
        res = (res + A1_L) % MOD;
        res = (res + A1_LL) % MOD;
        return (int) res;
    }
}