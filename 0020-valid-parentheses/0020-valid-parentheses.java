class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
    
        for(char ch:s.toCharArray()){
           if(ch=='(' || ch=='[' || ch=='{'){
               st.push(ch);
           } 
           else if(!st.isEmpty() && isMatchingPair(st.peek(),ch)){
        st.pop();
           }
           else{
               return false;
               }
           }
           return st.isEmpty();
        }
        private boolean isMatchingPair(char o,char c){
            return (o=='('  && c==')')   ||
                   (o=='{'  && c=='}')   || 
                   (o=='['  && c==']') ;
        
    }
}