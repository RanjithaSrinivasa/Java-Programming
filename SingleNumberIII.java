class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int i = 0;i< nums.length;i++){
            if(hashset.contains(nums[i])){
                hashset.remove(nums[i]);
            } else {
                hashset.add(nums[i]);
            }
        }
        int[] arr = new int[hashset.size()];
        int k = 0;
        for(Integer i: hashset){
            arr[k++] = i ;
        }
        return arr;
    }
}