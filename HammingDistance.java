import java.lang.Math;

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        String s1 = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String s2 = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        
        for(int i = 0; i < s1.length(); i++){
             if(s1.charAt(i)!=s2.charAt(i)){
                 count++;
             }
        }
  
        return count;
        
    }
}