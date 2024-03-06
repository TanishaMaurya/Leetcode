class Solution {
   
   public static List<String> gen(String p,int open,int close,ArrayList<String> l){
  if(open==0 && close==0){
      l.add(p);
      return l;
  }
  if(open !=0){
      gen(p+"(",open-1,close,l);
  }
  if(close>open){
      gen(p+")",open,close-1,l);
  }
  return l;
   }


    public List<String> generateParenthesis(int n) {
        return gen("",n,n,new ArrayList<>());
    }
}