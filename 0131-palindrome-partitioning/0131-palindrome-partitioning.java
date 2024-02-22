class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l=new ArrayList<>();
        List<String> p=new ArrayList<>();
        insertlist(0,s,p,l);
        return l;
    }
    static void insertlist(int ind,String s,List<String> p,List<List<String>> l){
        if(ind==s.length()){
            l.add(new ArrayList<>(p));
            return;
        }else{
            for(int i=ind;i<s.length();i++){
                if(IsPalindromes(s,ind,i)){
                    p.add(s.substring(ind,i+1));
                    insertlist(i+1,s,p,l);
                    p.remove(p.size()-1);
                }
            }
        }
    }
    static boolean IsPalindromes(String s,int st,int e){
        while(st<=e){
            if(s.charAt(st++)!=s.charAt(e--)){
                return false;
            }
        }
        return true;
    }
}