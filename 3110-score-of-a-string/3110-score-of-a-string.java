class Solution {
    public int scoreOfString(String s) {
        int res=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            int r=(int)s.charAt(i);
            int l=(int)s.charAt(i-1);
            res +=Math.abs(r-l);
        }
        return res;
    }
}