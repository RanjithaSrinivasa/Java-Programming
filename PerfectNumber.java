class Solution {
    public boolean checkPerfectNumber(int num) {
        int i = 1;
        int sum = 0;
        if(num == 0) return false;
        while(i < num){
            if(num%i == 0){
                sum += i;
                i++;
            } else{
                i++;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
        
    }
}