class Solution {
    public boolean isPowerOfTwo(int n) {
        int a=0;
        while(true){
            if(Math.pow(2,a)==n){
                return true;
            }
            else if(Math.pow(2,a)<n){
                a++;
            }
            else{
                return false;
            }
        }
    }
}