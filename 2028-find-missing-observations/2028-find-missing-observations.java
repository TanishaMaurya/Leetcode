class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i=0;i<rolls.length;i++){
            sum+=rolls[i];
        }
        int remSum= mean*(n+rolls.length)-sum;
        if(remSum>6*n || remSum<n){
            return new int[0];
        }
        int distmean=remSum/n;

        int mo=remSum%n;
        int [] nele=new int[n];
        Arrays.fill(nele,distmean);
        for(int j=0;j<mo;j++){
            nele[j]++;
        }
        return nele;
    }
}