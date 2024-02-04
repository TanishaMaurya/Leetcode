class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        while(n>0){
            if(sb.toString().equals(goal)){
                return true;
            }
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            n--;
        }
        return false;
    }
}