class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        StringBuilder s=new StringBuilder();
        for(char c:num.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        for(char c:st){
            if(s.length()==0 && c=='0') continue;
            s.append(c);
        }
        return s.length()==0 ? "0" : s.toString();
    }
}