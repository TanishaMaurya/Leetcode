class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> a1p=new HashSet<Integer>();
        for(int val:arr1){
            while(!a1p.contains(val) && val>0){
                a1p.add(val);
                val /=10;
            }
        }
        int longestPrefix=0;
        for(int val:arr2){
            while(!a1p.contains(val) && val>0){
                val /=10;
            }
            if(val>0){
                longestPrefix =Math.max(longestPrefix, (int)Math.log10(val)+1);
            }
        }
        return longestPrefix;
    }
}