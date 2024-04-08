class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> stQ=new LinkedList<>();
     Queue<Integer> saQ=new LinkedList<>();
        for(int x:students){
            stQ.add(x);
        }
         for(int x:sandwiches){
            saQ.add(x);
        }
        int i=0;
        while(!stQ.isEmpty()){
        if(i>stQ.size()){
            return stQ.size();
        }
            int s=stQ.poll();
        if(saQ.peek()==s){
            saQ.poll();
            i=0;
        }
            else{
                stQ.add(s);
                i++;
            }
            
            
            }
        return 0;
    }
}