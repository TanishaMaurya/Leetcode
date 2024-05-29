class Solution {
    public int numSteps(String s) {
       int n=s.length();
       int c=0;
        int carry=0;
        for(int i=n-1;i>0;i--){
            int digit= Character.getNumericValue(s.charAt(i))+carry;
            if(digit%2 ==1){
                c +=2;
                carry=1;
            }else{
                c++;
            }
        }
        return c+carry;
    }
}