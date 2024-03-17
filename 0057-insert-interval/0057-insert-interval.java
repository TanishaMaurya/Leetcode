class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     List<int[]> ans=new ArrayList<>();
     int s=newInterval[0],e=newInterval[1];
     boolean inserted=false;
     for(int[] a:intervals){
        int cs=a[0],ce=a[1];
        if(ce<s || inserted){
            ans.add(new int[]{cs,ce});
            continue;
        }
        s=Math.min(s,cs);
        if(e<cs){
            ans.add(new int[]{s,e});
            ans.add(new int[]{cs,ce});
            inserted=true;
            continue;
        }
        if(e<= ce){
            ans.add(new int[]{s,ce});
            inserted=true;
        }
     }  
     if(!inserted){
        ans.add(new int[]{s,e});

     } 
     return ans.toArray(new int[ans.size()][]);
    }
}