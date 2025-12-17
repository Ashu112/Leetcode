class Solution {
public:
    int thirdMax(vector<int>& nums) {
         // have 3 variables to store first,second and third maximum each integer min
        // for every elemnt in array
        //    1. Check if it is greater than first, update first second and third
        //    2. Check if it is greater than second, update second and third
        //    3. Check if it is only greater than third, update third
        // return third maximum variable;
        long long first = LLONG_MIN ;
        long long second = LLONG_MIN ;
        long long third = LLONG_MIN;

        for(int i = 0 ; i < nums.size();i++){
            if(nums[i] == first || nums[i] == second || nums[i] == third)continue;
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i] > second){
                third = second;
                second = nums[i];
            }else if(nums[i] > third){
                third = nums[i];
            }
        }
        if(third == LLONG_MIN)return first;

        return third;
    }
};