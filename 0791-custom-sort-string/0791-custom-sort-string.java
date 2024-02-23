class Solution {
    public String customSortString(String order, String s) {
        List<Character> ss=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ss.add(s.charAt(i));
        }
        Collections.sort(ss,(a,b)->order.indexOf(a)-order.indexOf(b));
        String ans="";
        for(Character c:ss)ans+=c;
        return ans;
    }
}