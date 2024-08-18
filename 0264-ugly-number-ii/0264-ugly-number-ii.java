class Solution {
    public int nthUglyNumber(int n) {
      
        TreeSet<Long>  uglyNumbers=new TreeSet<>();
         uglyNumbers.add(1L);
        Long currentugly=1L;
        for(int i=0;i<n;i++){
            currentugly =  uglyNumbers.pollFirst();
            
            uglyNumbers.add(currentugly*2);
            uglyNumbers.add(currentugly*3);
            uglyNumbers.add(currentugly*5);
        }
        return currentugly.intValue();
        
    }
}