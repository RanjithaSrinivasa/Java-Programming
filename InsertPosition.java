class Solution {
    public int searchInsert(int[] nums, int target) {
            if(target < nums[0]) return 0;
            //target greater than last elem, add an index
            else if(target > nums[nums.length-1]) return nums.length;
            for(int i = 0; i <= nums.length; i++){
                if(target == nums[i]) return i;
                //if target is in between two elem's value then return i+1
                else if(target > nums[i] && target < nums[i+1]) return i+1;
            }
            return 0;
    }
}