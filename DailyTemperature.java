class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] arr = new int[T.length];
        for(int i = 0 ; i < T.length-1; i++){
            if(T[i+1] > T[i]){
                arr[i] = 1;
            } else if(T[i+1] <= T[i]){
                int j = i+1;
                while(j < T.length - 1 && T[j] <= T[i]){
                    j++;
                }
                if(T[j] > T[i]) {
                   arr[i] = j-i; 
                }
        }
        }
        return arr;
    }
}