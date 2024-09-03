class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        
        String num="";
        for(char ch:s.toCharArray()){
            num +=Integer.toString(ch-'a'+1);
        }
        while(k-- >0){
            int digitSum=0;
            for(char ch:num.toCharArray()){
                digitSum +=ch-'0';
            }
            num=Integer.toString(digitSum);
        }
        return Integer.parseInt(num);
    }
}