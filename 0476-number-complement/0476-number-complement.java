class Solution {
    public int findComplement(int num) {
        // String n=num.toString();
        String a=Integer.toBinaryString(num);
        int n=a.length();
        String p="";
        for(int i=0;i<n;i++){
            char c=a.charAt(i);
            if(c=='1'){
                p=p+'0';
            }else{
                p=p+'1';
            }
        }
        int dec =Integer.parseInt(p,2);
        return dec;
    }
}