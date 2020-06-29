class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        
        for(int i = 0; i< nums.length; i++){
         product*= nums[i];   
        }
        
        for(int j = 0; j< nums.length; j++){
            if(nums[j] == 0){
                count++;
            }
        }
        
        int temp = -1;
        int prod  = 1;
        if(count == 1){
            System.out.println("inside one zero");
            for(int k =0; k< nums.length; k++){
                System.out.println("elem is " + nums[k]);
                if(nums[k] == 0){
                   System.out.println("zero elem index " + k);
                   temp = k;
                } else {
                    prod *= nums[k];
                }
            }
            if(temp!= -1)
                nums[temp] = prod;
        }
        
        if(temp == -1) { 
            for(int j = 0; j< nums.length; j++){
                if(nums[j] == 0){
                    count++;
                    nums[j] = 0;
                } else
                    nums[j] = product / nums[j];
            }
        }
        if(temp != -1){
            for(int i = 0; i<nums.length;i++){
                if(i != temp){
                    nums[i] = product / nums[i]; 
                }
            }
        }
        
        return nums;
    }
}