class Solution {
    public String validIPAddress(String IP) {
        if(IP.contains(".")){
            
            String[] arr = IP.split("\\.");
            
            //Checks if the IP has 4 tokens
            if(arr.length != 4){
                //System.out.println("has incorrect tokens");
                return "Neither";
            }
            
            //check if ip addr starts with '.'
            if(IP.charAt(0) == '.')
                return "Neither";
            
            //chack if ip addr ends with '.'
            if(IP.charAt(IP.length() -1) == '.')
                return "Neither";

            //check if ip has '..'
            if(IP.contains(".."))
                return "Neither";
            
            //Loop over token and check for token's length, check for validity of token
            for(String i: arr){
                
                //checks if each token is ntw len 0 to 3
                if(i.length() < 0 || i.length() > 3){
                    //System.out.println("has incorrect length");
                    return "Neither";
                }
                
                //checks for leading zeroes and scenarios like '00'
                if(i.charAt(0) == '0' && i.length()>1) 
                    return "Neither";
                
                //checks if token has any alphabet
                for(int j = 0; j < i.length(); j++){
                    if(!Character.isDigit(i.charAt(j))){
                        return "Neither";
                    }
                }
                
                //checks if number is btw 0 to 255 and doesn't have lesding zeroes
                int n = Integer.parseInt(i);
                if(n < 0 || n > 255 ){
                    return "Neither"; 
                }  
            }
            return "IPv4";
        }
        else if(IP.contains(":")){
            
            String[] arr = IP.split(":");

            //Checks if the IP has 8 tokens
            if(arr.length != 8)
                return "Neither";
            
            //Checks if the IP starts with ':'           
            if(IP.charAt(0) == ':')
                return "Neither";
            
            //Checks if the IP ends with ':'
            if(IP.charAt(IP.length() -1) == ':')
                return "Neither";
            
            //Checks if the IP has '::'
            if(IP.contains("::"))
                return "Neither";
            
            //Loop over token
            for(String i: arr){

                //checks if each token is btw len 0 to 3
                if(i.length() < 0 || i.length() > 4){
                    //System.out.println("has incorrect length");
                    return "Neither";
                }
                

                //check if each char is digit/A-F/a-f
                char[] chars = i.toCharArray();
                for(char c:chars) {
                    boolean isDigit = c>=48 && c<=57;
                    boolean isUppercaseAF = c>=65 && c<=70;
                    boolean isLowerCaseAF = c>=97 && c<=102;
                    if(!(isDigit || isUppercaseAF || isLowerCaseAF)) 
                        return "Neither";
                }                
            }
            return "IPv6";   
            
        }
        return "Neither";
    }
}