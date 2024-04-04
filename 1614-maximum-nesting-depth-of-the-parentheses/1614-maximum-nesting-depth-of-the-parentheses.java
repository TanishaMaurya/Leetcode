class Solution {
    public int maxDepth(String s) {
         int count =0;
        int countMax=0;
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)=='('){
                count ++;
                countMax = Math.max(countMax, count);
            }
            if(s.charAt(i)==')'){
                count --;
            }
        }
    return countMax;
    }
}