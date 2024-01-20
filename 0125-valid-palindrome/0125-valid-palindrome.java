class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
	   StringBuilder nw=new StringBuilder();
  StringBuilder sb=new StringBuilder(s);
  char c;
   int n=sb.length();
   for(int i=0;i<n;i++){
        c=sb.charAt(i);
      if(c >= 'A'  && c <= 'Z'){
          c+=32;
          nw.append(c);
    
      }
     else if(c>='a'  && c<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
          nw.append(c);
     }
   }
   int i=0,j=nw.length()-1;
   while(i<=j){
    char p=nw.charAt(i);
    char q=nw.charAt(j);
     if(p!=q){
       return false;
     }
     else{
       i++;j--;
     }
   }
   return true;
    }
}