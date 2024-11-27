class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1. take 3 pointers i,j and k
        //      a. place i at last of mth index, j at last of num2 and k at last of num1
        // 2. traveerse via pointers toward start
        //      a. if num1[i] > num2[j], place it at kth index
        //      b. else place the num2 at kth index
        // 3. place all the remaining elements at kth index
        int i = m-1, j = n-1, k = m+n-1;
        while( i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}