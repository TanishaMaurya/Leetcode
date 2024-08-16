class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int res=0;
        int mini=arrays.get(0).get(0);
        int maxi=arrays.get(0).get(arrays.get(0).size()-1);
        for(int i=1;i<arrays.size();i++){
            List<Integer> currArr=arrays.get(i);
            int currmini=currArr.get(0);
            int currmaxi=currArr.get(currArr.size()-1);
            res=Math.max(res,currmaxi-mini);
            res=Math.max(res,maxi-currmini);
            mini=Math.min(currmini,mini);
            maxi=Math.max(currmaxi,maxi);
        }
    return res;
    }
}






