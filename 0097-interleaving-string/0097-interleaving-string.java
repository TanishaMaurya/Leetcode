class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0 && s2.length()==0 && s3.length()==0){
        return true;
       }
        
       if(s1.length() + s2.length() != s3.length())return false;
        int i=s1.length() , j=s2.length();
       
        Boolean[][] dp=new Boolean[i+1][j+1];
        return check(s1,s2,s3,0,0,0,dp);
    }
    public boolean check(String s1,String s2,String s3 ,int i,int j,int k,Boolean dp[][]){
       
        if(k==s3.length()){
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean one=false;
        boolean two=false;
        if(i<s1.length()){
       if(s1.charAt(i) == s3.charAt(k) ){
            one=  check(s1,s2,s3,i+1,j,k+1,dp);
        }
        }
        if(j<s2.length()){
         if(s2.charAt(j) == s3.charAt(k)){
         two= check(s1,s2,s3,i,j+1,k+1,dp);   
        }
        }
        return dp[i][j]=one || two;
    }
}