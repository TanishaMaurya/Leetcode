class Solution {
    public int findTheWinner(int n, int k) {
     List<Integer> l=new LinkedList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        int startindex=0;
        while(l.size()>1){
            int removeindex=(startindex+k-1)%l.size();
            l.remove(removeindex);
            startindex=removeindex;
        }
        return l.getFirst();
    }
}