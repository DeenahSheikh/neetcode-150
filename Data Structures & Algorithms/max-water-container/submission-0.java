class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;

        int maxx=0;

        while(right>left){
            int w=right-left;
            int area=Math.min(heights[left],heights[right])*w;
            maxx=Math.max(area,maxx);

            if(heights[right]>heights[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxx;
    }
}
