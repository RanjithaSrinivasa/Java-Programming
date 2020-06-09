class Solution {
    public boolean isPowerOfTwo(int n) {
/*
long m = 0;
        for(int i = 0; i < n; i++) {
            m = Math.pow(2, i);
            if(m == n) 
               return true;


        } 
       return false; */
        
        long i = 1;
        while (i < n) {
            i = i * 2;
        }
        return (i == n) ; 
    }
}