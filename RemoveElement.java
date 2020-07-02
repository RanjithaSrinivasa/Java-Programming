class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length - 1;
        int i = 0;
        
        //if elemnt has one element
        if(nums.length == 1 && nums[i] == val){
            return 0;
        }
        
        //by the time i==len, we would have processed all the elemnts
        //and pushed the values to the end
        while(i < len){
            //take each elemnt in array and check if it matches value 
            //if it does swap that elem with last elem
            if(nums[i] == val){
                //if last elem is a value given then decrement len until you find 
                //other elem to swap
                while(len > 0 && nums[len] == val){
                    //if array has elem matching value you just return i, eg: [2,4,4,4] val = 4]
                    if(i == len) return i;
                    //else decrement
                    else len--;
                }
                if(len < 0){
                    break;
                }else if(len >= 0 && nums[len] != val){
                    //swapping
                    int temp = nums[len];
                    nums[len] = nums[i];
                    nums[i] = temp;
                    len--;
                    i++;
                }
            }
            else{
                //if elem doesnt match value, proceed to next
                i++;
            }
        }

        if(len == i && nums[i] == val){
            return i;
        }
        return len+1;
    }
}