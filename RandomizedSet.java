class RandomizedSet {
    List<Integer> arr; 
    HashMap<Integer,Integer> hash;
    java.util.Random rand = new java.util.Random();; 

    /** Initialize your data structure here. */
    public RandomizedSet() {
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer,Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hash.containsKey(val))
            return false;
        else{
            arr.add(val);
            hash.put(val, arr.size()-1);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hash.containsKey(val)){
            return false; 
        }
        int index = hash.get(val);
        if(index < (arr.size() - 1)) {
            Collections.swap(arr, index, arr.size()-1);
            hash.put(arr.get(index), index);
        }
        arr.remove(arr.size() -1);
        hash.remove(val); 
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
       return arr.get( rand.nextInt(arr.size()) );       
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */