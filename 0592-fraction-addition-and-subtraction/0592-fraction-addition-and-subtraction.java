class Solution {
    
    private int FindGCD(int x,int y){
        if(x==0) return y;
        return FindGCD(y%x,x);
    }
    
    
    public String fractionAddition(String expression) {
       int num=0,deno=1;
        String[] nums=expression.split("/|(?=[-+])");
        for(int i=0;i<nums.length;i+=2){
            int curnum=Integer.parseInt(nums[i]);
            int curdeno=Integer.parseInt(nums[i+1]);
            num=num*curdeno + curnum*deno;
            deno=deno*curdeno;
        }
        int gcd=Math.abs(FindGCD(num,deno));
        num /= gcd;
        deno /=gcd;
        
        return num+ "/" + deno;
        
    }
    
}