class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for(int i: nums){
               if(!hashset.add(i))
                   return i;
        }
        return -1;
    }
}