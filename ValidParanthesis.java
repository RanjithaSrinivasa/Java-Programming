class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        if((s.length() % 2) != 0)
            return false;
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            } else if(s.charAt(i)==')' && (!stack.isEmpty()) && stack.peek()=='('){
                stack.pop();
            } else if(s.charAt(i)==']' && (!stack.isEmpty()) && stack.peek()=='['){
                stack.pop();
            } else if(s.charAt(i)=='}' && (!stack.isEmpty()) && stack.peek()=='{'){
                stack.pop();
            }  
        }
        return stack.isEmpty();        
    }
}