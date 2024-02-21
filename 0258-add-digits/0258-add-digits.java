class Solution {
     
    public int addDigits(int num) {
     if(num==0) return 0;
    
       int tot=0; 
        while(num > 0)  
          {  
            tot += num%10;
      num = num / 10;  
   
     
}  

 
        if(tot >= 10){
          return addDigits(tot);
        }
       
       return tot;
    
    }
}