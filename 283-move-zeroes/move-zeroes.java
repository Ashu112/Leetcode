class Solution {
    public void moveZeroes(int[] nums) {
        // 1. take two pointers i,j both placed at first index
        // 2. move j such that we swap the non zero vlaue
        int i=0,j = 0;
        int n = nums.length;
        while(j < n){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}