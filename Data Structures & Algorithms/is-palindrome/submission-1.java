class Solution {
    public boolean isPalindrome(String s) {
        int forward_counter = 0;
        int backward_counter = s.length() - 1;
        String lowercase = s.toLowerCase();

        boolean anyChars = false;
        for(int i=0; i<s.length() && !anyChars; i++){
            if(isAlphanumeric(s.charAt(i))){
                anyChars = true;
            }
        }

        if(!anyChars){
            return true;
        }

        while(forward_counter < backward_counter){
            while(!isAlphanumeric(lowercase.charAt(forward_counter))){
                forward_counter++;
            }

            while(!isAlphanumeric(lowercase.charAt(backward_counter))){
                backward_counter--;
            }
            // System.out.println("forward_counter char:" + lowercase.charAt(forward_counter));
            // System.out.println("backward_counter char:" + lowercase.charAt(backward_counter));

            if(lowercase.charAt(forward_counter) != lowercase.charAt(backward_counter)){
                return false;
            }

            forward_counter++;
            backward_counter--;
        }
        return true;
    }

    public boolean isAlphanumeric(char c){
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
