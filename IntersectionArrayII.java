class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        //two hashmap one to maintain the count and another to hold intersection values
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        Map<Integer, Integer> result = new HashMap<Integer,Integer>();
        
        //go through first array and add them to map with count
        for(int i=0; i< nums1.length; i++){
            if(!hashmap.containsKey(nums1[i])){
                hashmap.put(nums1[i], 1);
            } else {
                int c = hashmap.get(nums1[i]);
                hashmap.remove(nums1[i]);
                hashmap.put(nums1[i], c+1);
            }
        }
        
        //check if elem in nums2 exists in hashmap, and add these elements to new hashmap with count
        for(int i = 0; i< nums2.length; i++){
            if(hashmap.containsKey(nums2[i])) {
                int c = hashmap.get(nums2[i]);
                if(c == 1){
                     hashmap.remove(nums2[i]); 
                    if(result.containsKey(nums2[i])){
                        int c2 = result.get(nums2[i]);
                        result.put(nums2[i], c2+1);
                    }else{
                      result.put(nums2[i], 1);  
                    }
                }
                else if(c > 1){
                    hashmap.remove(nums2[i]);
                    hashmap.put(nums2[i], c-1);
                    if(result.containsKey(nums2[i])){
                        int c2 = result.get(nums2[i]);
                        result.put(nums2[i], c2+1);
                    }else{
                      result.put(nums2[i], 1);  
                    }
                }
            }
        }


       //FIND THE LENGTH OF ARRAY TO RETURN    
       int length = 0;
        for(Map.Entry element: result.entrySet()){
            int count = (int)element.getValue();
            length = length + count;
        }

        
        //add result map elements to array by taking count
        int[] arr = new int[length];
        int j = 0;
        for(Map.Entry element: result.entrySet()){
            int num = (int)element.getKey();
            int count = (int)element.getValue();
            int i = 0;
            while(i < count){
                arr[j++] = num;
                i++;
            }
        }


        return arr;
    }
}