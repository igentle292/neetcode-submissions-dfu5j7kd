class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        } else if(s.length() == 0){
            return true;
        }
        Stack<Character> prev_parentheses = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                prev_parentheses.push(s.charAt(i));
            } else if(!prev_parentheses.empty()){
                if(s.charAt(i) == ')'){
                    if(prev_parentheses.peek() == '('){
                        prev_parentheses.pop();
                    } else{
                        return false;
                    }
                } else if(s.charAt(i) == ']'){
                    if(prev_parentheses.peek() == '['){
                        prev_parentheses.pop();
                    } else{
                        return false;
                    }
                } else if(s.charAt(i) == '}'){
                    if(prev_parentheses.peek() == '{'){
                        prev_parentheses.pop();
                    } else{
                        return false;
                    }
                } 
            } else{
                return false;
            }
        }

        return prev_parentheses.empty();
    }
}
