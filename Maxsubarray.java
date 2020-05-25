class Solution { 
    public int maxSubArray(int[] nums) {

    /* when input is [-1] assigning localsum
       to zero gives wrong output */

    int currentsum = nums[0];
    int globalsum = nums[0];

    /* method2 - assigning local sum to -2^31
     * so that max is not 0
     * int currentsum = 0;
     * int globalsum = (int)-Math.pow(2, 31) ;
     */

    for(int i = 1 ; i < nums.length; i++) {
        currentsum = Math.max(nums[i], currentsum + nums[i]);
        if(currentsum > globalsum) {
            globalsum = currentsum;
        }
    }
    return globalsum;
    }
}
