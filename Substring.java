class Solution {
    public int strStr(String haystack, String needle) {
        //if needle is empty string
        if(needle.length() == 0) return 0;
        
        //if haystack is empty
        if(haystack.length() == 0) return -1;
        
        if(haystack.length() < needle.length() ) return -1;
        
        for(int i = 0; i< haystack.length(); i++) {
           /*need to check if haystack has enough characters to verify 
           eg : "mississippi" "issipi" when i = 5 we try access elem i+j = 11
           which gives out of bounds exception */
            
           if(haystack.length() < needle.length() + i) break;
            for(int j = 0; j < needle.length(); j++) {
                //i+j because you have to increment i's index for matching substring
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
                
                //once the substring match is found return index
                if(j == needle.length()-1) return i;
            }
        }
    return -1;    
    }
}