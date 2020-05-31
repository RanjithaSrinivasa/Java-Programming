class Solution {
    public int lengthOfLastWord(String s) {
    if(s.length() ==  0) return 0;
    
    //checks if string is empty and has whitespace
    // the above case won't return 0 for string s = " ", length is 1
        
    if(s.isBlank()) {
        return 0;
    }
    else {   
     String arr[] = s.split(" ");
     int len = arr.length;
        return arr[len-1].length();
    }
    }
}