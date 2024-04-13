class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] heights=new int[n];
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                heights[j]=matrix[i][j]=='1' ? heights[j]+1:0;
            }
            ans=Math.max(ans,rectArea(heights));
        }
        return ans;

    }
  //find rectangle  
  public int rectArea(int[] heights){
      int n=heights.length;
      int []sr=findsr(heights);
      int []sl=findsl(heights);
      int maxArea=0;
      for(int i=0;i<n;i++){
          int w=sr[i]-sl[i]-1;
          int area=w*heights[i];
          maxArea=Math.max(area,maxArea);
      }
      return maxArea;

  }

  //find next smaller element on right
  public int[] findsr(int[] arr){
 int [] nsr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] =arr.length;
            }
            else{
        
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        return nsr;

  }

// /find next smaller element on left
  public int[] findsl(int[] arr){
  int [] nsl = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] =-1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        return nsl;
  }

}