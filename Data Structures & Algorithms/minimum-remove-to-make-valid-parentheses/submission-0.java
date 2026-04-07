class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == ""){
            return s;
        }
        Stack<Integer> parens_indexes = new Stack();
        Stack<Character> parentheses = new Stack();
        for(int i=0; i<s.length(); i++){
            // System.out.println("looking at char: " + s.charAt(i));
            if(s.charAt(i) == '('){
                parentheses.push(s.charAt(i));
                parens_indexes.push(i);
            } else if(s.charAt(i) == ')'){
                if(!parentheses.empty() && parentheses.peek() == '('){
                    parentheses.pop();
                    System.out.println("popping index: " + parens_indexes.pop());
                } else{
                    parens_indexes.push(i);
                }
                
            }
        }

        // System.out.println("string length" + s.length());
        // System.out.println("parentheses to remove" + parens_indexes.size());
        for(int index : parens_indexes){
            System.out.println("index to remove: " + index);
        }

        StringBuilder build = new StringBuilder();
        for(int j=0; j<s.length(); j++){
            if((s.charAt(j) == '(' || s.charAt(j) == ')') && parens_indexes.contains(j)){
                System.out.println("Skipping parens at index: " + j);
                continue;
            } else{
                build.append(s.charAt(j));
            }
        }

        return build.toString();
    }
}