class Solution {
    public boolean validPalindrome(String s) {
    return isPalindrome(s,0,s.length()-1,1);

    }
    public boolean isPalindrome(String s,int i,int j,int chance){
        if(i>=j) return true;
        if(s.charAt(i)==s.charAt(j)) return isPalindrome(s,i+1,j-1,chance);

        if(chance==0) return false;
        return isPalindrome(s,i+1,j,chance-1) || isPalindrome(s,i,j-1,chance-1);
    }
}