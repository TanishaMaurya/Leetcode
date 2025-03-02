class Solution {
    public String longestCommonPrefix(String[] strs) {
         int n=strs.length;   
        Arrays.sort(strs);       
        String s1=strs[0], s2=strs[n-1];      
        StringBuilder a=new StringBuilder();
      for(int i=0;i<Math.min(s1.length(),s2.length());i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            return a.toString();
        }
         a.append(s1.charAt(i));
           
        }
       return a.toString();

    }
}


