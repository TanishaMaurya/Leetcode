class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        int white=0;
        long swapno=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                swapno += i-white;
                white++;
            }
        }
        return swapno;
    }
}