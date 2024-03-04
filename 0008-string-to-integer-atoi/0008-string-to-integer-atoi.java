class Solution {


 public int myAtoi(String s) {
        //clear all blanks and trailing zeros
        s=s.trim();
        if(s.isEmpty()) return 0;
        return atoirecur(s,0,1,0);
    }
   public int atoirecur(String s,int i,int sign,long ans){
       if(i==s.length()) return (int)(sign*ans);
       char c=s.charAt(i);
       if(Character.isDigit(c)){
           ans = (ans*10) +(c-'0');
           if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;  

           return atoirecur(s,i+1,sign,ans);
       }else if(i==0 && (c=='+' || c=='-')){
           if(c=='+') return atoirecur(s,i+1,sign,ans);
           if(c=='-') return atoirecur(s,i+1,sign*-1,ans);

       }
       return (int)(sign*ans);
   }

   
}