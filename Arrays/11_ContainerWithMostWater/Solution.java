class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int area;
        int left=0;
        int right=height.length-1;
        while(left<right){
          area=Math.min(height[left],height[right])*(right-left);
          maxarea=Math.max(maxarea,area);
          if(height[left]>height[right]){
            right--;
          }  
          else{
            left++;
          }
        }
        return maxarea;
    }
}