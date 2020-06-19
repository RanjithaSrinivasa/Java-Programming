class Solution {
    public int removeDuplicates(int[] nums) {
        
        //adding all unique elements to set
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!(treeset.contains(nums[i])))
               treeset.add(nums[i]);
        }
        

        int size = treeset.size();
        int i = 0;
        
    //rewrite the array elements to contain unique elements for up until set's size
        while(!treeset.isEmpty()){
           int temp  = treeset.pollFirst();
           nums[i] = temp;
           i++;
        }
        
        return size;
    }
}