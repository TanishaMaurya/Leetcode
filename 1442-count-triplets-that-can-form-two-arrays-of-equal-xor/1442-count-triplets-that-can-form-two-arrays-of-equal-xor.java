class Solution {
    public int countTriplets(int[] arr) {
        int[] p=new int[arr.length+1];
        
        p[0]=0;
        System.arraycopy(arr,0,p,1,arr.length);
        int size=p.length;
        for(int i=1;i<size;i++){
            p[i] ^=p[i-1];
        }
        int count=0;
        for(int s=0;s<size;s++){
            for(int e=s+1;e<size;e++){
                if(p[s]==p[e]){
                    count += e-s-1;
                }
            }
        }
        return count;
    }
}