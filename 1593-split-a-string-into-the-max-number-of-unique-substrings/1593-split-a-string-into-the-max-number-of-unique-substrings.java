class Solution {
    public int maxUniqueSplit(String s) {
        return helper(s,new HashSet());
    }
    private int helper(String s, Set<String> se){
        int maxi=0;
        for(int i=1;i<=s.length();i++){
            String ch=s.substring(0,i);
            if(!se.contains(ch)){
                se.add(ch);
                maxi=Math.max(maxi,1+helper(s.substring(i),se));
                se.remove(ch);
            }
            
        }
        return maxi;
    }
}