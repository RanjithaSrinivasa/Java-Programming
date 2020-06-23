class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int temp = 0;
        
        if(x == 1){
            return 1;
        }
        
        while(i <= x){
            if((x/i == i) || (x/i > i) && x/(i+1) < (i+1)){
                temp = i;
                break;
            } else
                i++;
        }
        return temp;    
    }
}