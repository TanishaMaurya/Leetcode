class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;


        //Find previous smaller element index
        Stack<Integer>s =new Stack<>();
        int[] prev=new int[n]; 
        int[] next=new int[n];
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
           if(s.isEmpty()){
                prev[i]=-1;
            }
            else{
                prev[i]=s.peek();
            }
            s.push(i);
        } 
        
        
         while (!s.isEmpty()) s.pop();
        
        for (int i = 0; i < n; i++) {
            next[i] = n;
        } 
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=n;
            }
            else{
                next[i]=s.peek();
            }
            s.push(i);
        } 
        int maxarea=0;
        for (int i=0;i<n;i++){
            maxarea=Math.max(maxarea,heights[i]*(next[i]-prev[i]-1));
        }
        return maxarea;
  
        
    }
}