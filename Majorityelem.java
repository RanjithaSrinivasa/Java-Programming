class Majorityelem {
    static int max;
    public int majorityElement(int[] nums) {
        max = nums.length/2;
        int temp = 0;
        for(int i = 0; i< nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count >= nums.length/2 && count > max) {
                max = count;
                temp = nums[i];
                break;
            }

        }
        return temp;
        
    }
}