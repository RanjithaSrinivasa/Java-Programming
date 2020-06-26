import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int singleNumber(int[] nums) {
        int elem = 0;

        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        
        for(int i  = 0; i < nums.length; i++){            
            if(hashmap.containsKey(nums[i])){                
                int temp = hashmap.get(nums[i]);
                if(temp == 2){
                      hashmap.remove(nums[i]);
                } 
                else{
                hashmap.remove(nums[i]);
                hashmap.put(nums[i], temp+1);
                }
            }
            else {
                hashmap.put(nums[i],1);
            }
        }

        for (Integer key : hashmap.keySet()) {
            elem = key;
        }
        return elem;

    }
}