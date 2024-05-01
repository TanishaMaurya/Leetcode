class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int n5=0,n10=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5) n5++;
            else if(bills[i]==10){
                n10++;
                n5--;
            }
            else{
                if(n10 >0) {
                    n10--;
                    n5--;
                }else{
                    n5 =n5-3;
                }
            }
            if(n10 < 0 || n5 <0){
                return false;
            }
        }
        return true;
    }
}