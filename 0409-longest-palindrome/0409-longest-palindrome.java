class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int count=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                
               hm.put(c,hm.get(c)+1);
            }
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }
        }
        boolean oddFound=false;
        for(Integer val:hm.values()){
            
            if(val%2==0){
                count += val;
            }
           else{
               count +=val-1;
               oddFound=true;
           }
        }
        if(oddFound){
            count++;
        }
        return count;
    }
}

    