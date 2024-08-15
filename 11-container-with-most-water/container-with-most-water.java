class Solution {
    public int maxArea(int[] height) {
        int maxCap = 0 ;
        int l = 0, r= height.length -1;
        while(l<r){
            int dist = r-l;
            int ht = Math.min(height[l],height[r]);
            int cap = dist*ht;
            maxCap = Math.max(cap,maxCap);
            if(height[l]< height[r])l++;
            else r--;
        }
        return maxCap;
    }
}