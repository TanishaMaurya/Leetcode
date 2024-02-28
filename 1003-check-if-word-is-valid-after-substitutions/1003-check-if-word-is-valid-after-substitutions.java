class Solution {
    public boolean isValid(String s) {
        Stack<Character> t=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='c'){
                if(t.size()>=2 && t.pop()=='b' && t.pop()=='a'){
                    
                }else{
                    return false;
                }
                
            }else{
                t.push(ch);
            }
        }
        return t.size()==0;
    }
}