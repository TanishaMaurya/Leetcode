class Solution {
    public String largestOddNumber(String num) {
          int n=num.length();
          for(int i=n-1;i>=0;i--){
              char ch=num.charAt(i);
              int x=Character.getNumericValue(ch);
              if(x%2==1){
                        return num.substring(0,i+1);
              }
          }
          return "";
    }
}
