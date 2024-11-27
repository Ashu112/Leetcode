class Solution {
    public void moveZeroes(int[] nums) {
        // 1. take 2 pointers i,j and place them at start of array
        // 2. traverse array with j pointer 
        //      a. if j is non zero element swap with ith element
        int i = 0 , j = 0;
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