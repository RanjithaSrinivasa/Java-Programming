class Solution {
    static int globalsum = 0; 
    public int maxSubArray(int[] nums) {
    int currentsum = 0;
    for(int i = 0 ; i < nums.length; i++) {
        currentsum = Math.max(currentsum, currentsum + nums[i]);
        if(currentsum > globalsum) {
            globalsum = currentsum;
        }        
            /*
        if(currentsum < (currentsum + nums[i]) ) {
            currentsum = currentsum + nums[i];
        }
        else {
            currentsum = 0;
        }
        if(currentsum > globalsum) {
            globalsum = currentsum;
        }*/
    }
    return globalsum;
    }
}