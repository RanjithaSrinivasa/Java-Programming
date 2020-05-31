class Solution {
    public int romanToInt(String s) {
        String arr[] = s.split("");
        int nums[] = new int[s.length()];
        for(int i =0; i < s.length(); i++) {
            switch (arr[i]) {
                case "I":{
                    nums[i] = 1;
                    break;
                }
                case "V":{
                    nums[i] = 5;
                    break;
                }
                case "X":{
                    nums[i] = 10;
                    break;
                }
                case "L":{
                    nums[i] = 50;
                    break;
                }
                case "C":{
                    nums[i] = 100;
                    break;
                }
                case "D":{
                    nums[i] = 500;
                    break; 
                }
                case "M":{
                    nums[i] = 1000;
                    break;
                }
            }            
        }
      System.out.println("array elements");
      for(int k= 0; k < s.length(); k++) {
          System.out.println(nums[k]);
      }
        
      int prev = nums[0];
      int sum = nums[0];
      for(int j = 1; j < nums.length; j++) {
          //case when prev is greater / equal to current eg : III / XI
          if(prev >= nums[j]) {
              System.out.println("num is " + nums[j]);
              sum += nums[j];
              System.out.println("sum is " + sum);
          }
          //case when prev less than curr eg : IX or IV 
          else {
                  System.out.println("num is " + nums[j]);
                  int temp = nums[j] - prev;
                  sum = sum + temp - prev;
                  System.out.println("sum is " + sum);
          }
          System.out.println("prev before " + prev);
          prev = nums[j];
          System.out.println("prev before " + prev);
          System.out.println("");
      }
      return sum;
        
    }
}