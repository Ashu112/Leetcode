class Solution {
    public int pivotIndex(int[] nums) {
        // 1. calculate the total sum 
        // 2. for each elemnt in array
        //      i. calculate the prefix sum 
        //      ii. sufix sum = total sum - prefix
        //             a. if prefix sum = sufix sum return i
        // 3. return -1
        int totalSum = 0;
        int prefixSum = 0;
        for(int i = 0 ; i < nums.length;i++){
            totalSum += nums[i];
        }

        for(int i = 0 ; i<nums.length ; i++){
            prefixSum += nums[i];
            int sufixSum = totalSum - prefixSum + nums[i];
            if(prefixSum == sufixSum)return i;
        }
        return -1;
        
    }
}