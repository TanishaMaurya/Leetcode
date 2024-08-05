class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        int n=arr.length;
        for(String str:arr){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        int c=0;
         for(String str:arr){
            if(hm.get(str)==1){
                c++;
            }
            if(c==k){
                return str;
            }
        }
        return "";
    }
}