class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0){
            return 1;
        }
         int n = nums.length;
         int totalsum = 0; 
         int leftsum = 0;

         for(int i : nums){
             totalsum = totalsum + i;
         }
         for(int i = 0; i < n; i++){
             if(leftsum == (totalsum - nums[i])){
             return i;
            } else {
             leftsum += nums[i];
             totalsum = totalsum - nums[i];
         }
         }
         return -1;
    }
}
