class Solution {

    public List<Integer> lexicalOrder(int n) {
             List<Integer> l=new ArrayList<>();
           for(int i=1;i<=n;i++){
               l.add(i);
           }   
        Collections.sort(l,new Comparator<Integer>(){
            @Override
            public int compare(Integer x,Integer y){
                return String.valueOf(x).compareTo(String.valueOf(y));
            }
        });
            return l;
    }
}