class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length,area=0;


        //Find previous smaller element index
        Stack<Integer>s =new Stack<>();
        int[] ss=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                ss[i]=s.peek();
            }else{

                ss[i]=-1;
            }
            s.push(i);
        }

        //find next smaller element index
       s =new Stack<>();
        int[] sr=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                sr[i]=s.peek();
            }else{

                sr[i]=n;
            }
            s.push(i);
        }

        //calculate area 
        for(int i=0;i<n;i++){
            int h=heights[i];
            int w=sr[i]-ss[i]-1;
            int curarea=h*w;
            area=Math.max(area,curarea);

        }
    return area;
        
    }
}