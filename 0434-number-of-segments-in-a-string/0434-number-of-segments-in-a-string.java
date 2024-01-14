class Solution {
    public int countSegments(String s) {
        
        int c=0;
       String []word=s.split(" ");
       for(String w:word){
           if(!w.isEmpty())
           c++;
       }
    
        return c;
    }
}