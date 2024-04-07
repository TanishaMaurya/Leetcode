class Solution {
    public boolean checkValidString(String s) {
      Stack<Integer> open = new Stack();
        Stack<Integer> star = new Stack();

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '('){
                open.push(i);
            }
            else if(s.charAt(i) == '*'){
                star.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!star.isEmpty() && star.peek() < i){
                    star.pop();
                }
                
                else{
                    return false;
                }
            }
        }
        if(open.size() == 0) return true;
        else{
            while(!star.isEmpty() && !open.isEmpty()){
                if(open.peek() < star.peek()){
                open.pop();
                star.pop();}
                else{
                    return false;
                }
            }
        }

        if(open.size() == 0) return true;
        return false;
        
    }
}