class Solution {
    
    public int sumval(int j){
        return (j*(j+1))/2;
    }
    
    
    public int pivotInteger(int n) {
       for(int i=1;i<=n;i++){
           int s1=sumval(i);
           int s2=sumval(n)-sumval(i-1);
           if(s1==s2){
               return i;
           }
       }
        return -1;
    }
}