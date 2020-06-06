class Solution {

    int[] arr;
    int sum = 0;
    public Solution(int[] w) {
      arr = new int[w.length];        
      for(int i= 0; i < w.length; i++) {
          sum += w[i];
          arr[i] = sum;
      }
    }
    
    public int pickIndex() {
        int r = 0;
        r = (int) (Math.random() * sum);
        //System.out.println("rand is " + r);
        return findIndex(r+1);
    }
    
    public int findIndex(int f){
        int res = 0;
        for(int i = 0 ; i< arr.length-1; i++){
            //System.out.println("first " + arr[i]);
            //System.out.println("second " + arr[i+1]);
            if(f == arr[i]) {
                //System.out.println("index is " + i);
                res = i;
                //return i;
            }
            else if(f > arr[i] && f <= arr[i+1]){
                //System.out.println("index is " + (i+1));
                res = i+1;
                //return i+1;
            }
        }
        return res;
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */