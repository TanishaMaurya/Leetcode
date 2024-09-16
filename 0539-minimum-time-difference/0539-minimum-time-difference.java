class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int minute[]=new int[n];
        for(int i=0;i<n;i++){
            String  time=timePoints.get(i);
            int h=Integer.parseInt(time.substring(0,2));
            int m=Integer.parseInt(time.substring(3));
        
            minute[i]=h*60 +m;
            
        }
            Arrays.sort(minute);
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<minute.length-1;i++){
                ans=Math.min(ans,minute[i+1]-minute[i]);
            }
            return Math.min(ans,24*60 - minute[minute.length-1]+minute[0]);
        
    }
}