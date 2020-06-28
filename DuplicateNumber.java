class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!hashset.contains(nums[i])){
                hashset.add(nums[i]);
            }
            else if(hashset.contains(nums[i]))
                return true;
        }
        return false; 
    }
}