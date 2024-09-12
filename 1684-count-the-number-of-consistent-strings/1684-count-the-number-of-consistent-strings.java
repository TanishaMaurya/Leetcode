class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      
        int count=0;
        for(String word:words){
            boolean Consistent=true;
            for(int j=0;j<word.length();j++){
                if(!allowed.contains(String.valueOf(word.charAt(j)) )  ){
                    Consistent=false; 
                    break;
                }              
            }
            if(Consistent){
                count++;
            }
        }
        return count;
    }
}
   