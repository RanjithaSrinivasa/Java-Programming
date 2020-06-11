class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 =0, count2 = 0; 
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0)
                count0++;
            else if(nums[i] == 1)
                count1++;
            else
                count2++;
        }
        int j = 0;
        while(count0 > 0){
            count0--;
            nums[j++] = 0;
        }
        while(count1 > 0){
            count1--;
            nums[j++] = 1;
        }
        while(count2 > 0){
            count2--;
            nums[j++] = 2;
        }
    }
}