class Solution { 
    public int maxSubArray(int[] nums) {
    int currentsum = nums[0];
    int globalsum = nums[0];
   // int currentsum = 0;
    //int globalsum = (int)-Math.pow(2, 31) ;
    for(int i = 1 ; i < nums.length; i++) {
        currentsum = Math.max(nums[i], currentsum + nums[i]);
        if(currentsum > globalsum) {
            globalsum = currentsum;
        }
    }
    return globalsum;
    }
}
