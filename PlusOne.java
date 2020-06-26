import java.io.*; 
import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length - 1] < 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        } else if(digits[digits.length - 1] == 9){
            int i = 0;
            int len = digits.length - 1;
            while(len-i >= 0 && digits[len-i] == 9){
                digits[len-i] = 0;
                i++;
            }
            if(len-i < 0){
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                int j = 1;
                while(j < arr.length){
                    arr[j++] = 0;
                }
                return arr;
            }  else {
                digits[len-i] += 1;
                return digits;
            }
        }
        return digits;
    }
}