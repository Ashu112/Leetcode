class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // 1. for each row element
        //         i. take tow pointers l and r
        //                a. swap l and r numbers
        // 2. traverse each elemnt and check if it is 0 or 1
         int n = image.length;
         for(int i = 0 ; i< n;i++){
            int l = 0, r = n-1;
            while(l<r){
                int temp = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = temp;
                l++;
                r--;
            }
         }

         for(int i=0; i<n;i++){
            for(int j =0;j<n;j++){
                if(image[i][j] == 0)image[i][j] =1;
                else image[i][j] =0;
            }
         }
         return image;
    }
}