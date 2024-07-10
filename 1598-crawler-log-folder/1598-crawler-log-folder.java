class Solution {
    public int minOperations(String[] logs) {
        // StringBuilder s=new StringBuilder(logs);
        int count=0;
        for(String c:logs){
            if(c.equals("../")){
               count=Math.max(0,count-1);
            }
            else if(c.equals("./")){
                continue;
            }
            else{
                count++;
            }
            
        }
        return count;
    }
}