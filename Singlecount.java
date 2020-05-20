class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;
        for(int i = 0; i< nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                temp = nums[i];
                break;
            }

        }
        return temp;
    }
}