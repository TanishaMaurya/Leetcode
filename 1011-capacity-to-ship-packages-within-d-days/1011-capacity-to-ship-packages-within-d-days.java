class Solution {

public boolean packages(int[] weights,int m,int days){
    int day=1;
    int sum=0;
    for(int i=0;i<weights.length;i++){
        sum += weights[i];
        if(sum > m){
            day++;
            sum=weights[i];
        }
    }
    return day <= days;
}

    public int shipWithinDays(int[] weights, int days) {
        int sum=0,max=0,ans=0;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
            max = Math.max(max,weights[i]);
        }
        if(weights.length == days){
            return max;
        }
        int l=max;
        int r=sum;
        while(l<= r){
            int m=(l+r)/2;
            if(packages(weights,m,days)){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}