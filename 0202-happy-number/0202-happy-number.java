class Solution {
    public static int sum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int val = n%10;
            sum = sum + (val*val);
            n=n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1 && !hs.contains(n))
        {
            hs.add(n);
            n = sum(n);
        }
        return n==1;
    }
}
