class Solution {
    public int maxArea(int[] height) {
     int n=height.length;
    int left=0,right=n-1;
        int maxArea=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,(width*h));
            
            while(left<right && height[left]<=h){
                ++left;
            }
            while(left<right && height[right]<=h){
                --right;
            }
        }
        return maxArea;
    }
}

//  int maxArea = 0;
//         int left = 0;
//         int right = heights.length - 1;

//         while(left < right) {
//             int width = right - left;
//             int height = Math.min(heights[left], heights[right]);
//             maxArea = Math.max(maxArea, width * height);
            
//             while (left < right && heights[left] <= height) {
//                 ++left;
//             }

//             while (left < right && heights[right] <= height) {
//                 --right;
//             }
//         }

//         return maxArea;