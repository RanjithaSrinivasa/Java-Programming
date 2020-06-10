class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int lastindex = -1, temp = -1;;
        for(int i=0; i< s.length(); i++){
            for(int j=lastindex+1; j< t.length(); j++){
                //System.out.println("inner loop");
                if(t.charAt(j) == s.charAt(i)){
                    if(j > lastindex){
                        //System.out.println("match found at " +  i + " " + s.charAt(i) + " match found at" + j + " " +  t.charAt(j));
                        lastindex = j;
                        break;
                    }
                    else{
                        //System.out.println(j + " "+lastindex);
                        return false;
                    }
                }
            }
            if(temp == lastindex){
                //System.out.println(temp + " "+ lastindex);
                return false;
            }
            else
                temp = lastindex;
        }
        return true;
        
    }
}