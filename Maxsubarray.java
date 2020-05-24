class Solution {
    static int globalsum = 0; 
    public int maxSubArray(int[] nums) {
    int currentsum = 0;
    for(int i = 0 ; i < nums.length; i++) {
        currentsum = Math.max(nums[i], currentsum + nums[i]);
        if(currentsum > globalsum) {
            globalsum = currentsum;
        }        
    }
    return globalsum;
    }
}
