class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++){
            switch (tokens[i]){
                case "*" : {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);
                    break;
                }
                case "+" : {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                    break;
                } 
                case "-" : {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a-b);
                    break;
                } 
                case "/" : {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a/b);
                    break;
                } 
                default : {
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
                }
            }
            
        }
      return stack.pop();  
    }
}