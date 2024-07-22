class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     HashMap<Integer,String> hm=new HashMap<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }
            Arrays.sort(heights);
            String[] sortname=new String[n];
            for(int i=n-1;i>=0;i--){
                sortname[n-i-1]=hm.get(heights[i]);
            }
      
        
        return sortname;
    }
}