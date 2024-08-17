class Solution {
    public int maxSubArray(int[] nums) {
        // 1. create a variable sum 
        // 2. intitalize ans to first index of array
        // 3. for each element in array
        //      i. add the sum
        //      ii. max the ans
        //      iii. if sum is negative make it to 0
        // 4. return ans
        int sum = 0;
        int ans = nums[0];
        for(int i = 0 ; i < nums.length;i++){
            sum += nums[i];
            ans = Math.max(ans,sum);
            if(sum<0)sum = 0;
        }
        return ans;
    }
}