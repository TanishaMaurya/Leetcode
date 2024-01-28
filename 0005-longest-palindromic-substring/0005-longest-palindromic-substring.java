class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int size=s.length();
        if (size<2) {  
            return s;
        }

        int start=0, end=0;
        for (int i=0;i<size;i++) {  
            int len = Math.max(fromCenter(s, i, i), fromCenter(s, i, i+1));   
            if (len > end-start+1) {   
                start = i - ((len-1)/2);
                end = i + len/2;
            }
        }

        return s.substring(start, end+1);
    }

    private int fromCenter(String s, int le, int ri) {
        while (le>=0 && ri<s.length() && s.charAt(le)==s.charAt(ri)) {
            le--;    
            ri++;    
        }
        return ri-le-1;  
    }
}