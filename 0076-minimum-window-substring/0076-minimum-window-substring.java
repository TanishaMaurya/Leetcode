class Solution {
    public String minWindow(String s, String t) {
      int m=s.length(),n=t.length();
      if(m<n) return "";
      Map<Character,Integer> hm=new HashMap<>();
      for(Character c:t.toCharArray()){
          hm.put(c,hm.getOrDefault(c,0)+1);
      }
      int st=0,e=0,ml=Integer.MAX_VALUE,si=0,c=n;
      while(e<m){
          if(hm.containsKey(s.charAt(e)) && hm.get(s.charAt(e))>0){
              c--;
          }
            hm.put(s.charAt(e),hm.getOrDefault(s.charAt(e),0)-1);
            e++;
            while(c==0){
                if(e-st<ml){
                    si=st;
                    ml=e-st;
                }
                if(hm.get(s.charAt(st))==0){
                    c++;
                }
                hm.put(s.charAt(st),hm.getOrDefault(s.charAt(st),0)+1);
                st++;
            }
      }
      return ml==Integer.MAX_VALUE ? "" : s.substring(si,si+ml);
    }
}