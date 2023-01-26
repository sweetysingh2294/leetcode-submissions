class Solution {
    public int trap(int[] height) {
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        int rightmax[]=new int[height.length];
        int waterlevel=0;
        int trappedwater=0;
        rightmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            waterlevel=Math.min(rightmax[i],leftmax[i]);
             trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    
}