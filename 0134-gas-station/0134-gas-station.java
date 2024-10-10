class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasCost=0;
        int n=gas.length,sum=0,pos=0,total=0;
        for(int i=0;i<n;i++){
           
            sum += gas[i]-cost[i];
            if(sum<0){
                
                total +=sum;
                sum=0;
                pos=i+1;
            }
        }
        total +=sum;
        return total>=0 ? pos : -1;
    }
}