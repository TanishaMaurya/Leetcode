class Solution {
    public int lengthOfLastWord(String s) {
      String ss[]=s.split(" ");
	        int n=ss.length,c=0,nn=0;
	        for(int i=0;i<n;i++){
	            if(i==n-1){	              
	              String j=ss[n-1];
	              nn=j.length();	                
	            }
	            }
        return nn;
    }
}
        