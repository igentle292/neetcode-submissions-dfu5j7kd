class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> stringSChars = new HashMap();
        HashMap<Character, Integer> stringTChars = new HashMap();

        for(int i=0; i<s.length(); i++){
            if(stringSChars.putIfAbsent(s.charAt(i), 1) != null){
                stringSChars.replace(s.charAt(i), stringSChars.get(s.charAt(i)) + 1);
            }
            if(stringTChars.putIfAbsent(t.charAt(i), 1) != null){
                stringTChars.replace(t.charAt(i), stringTChars.get(t.charAt(i)) + 1);
            }
        }
        System.out.println("First map: " + stringSChars);

        // for(int j=0; j<t.length(); j++){
        //     if(stringTChars.putIfAbsent(t.charAt(j), 1) != null){
        //         stringTChars.replace(t.charAt(j), stringTChars.get(t.charAt(j)) + 1);
        //     }
        // }

        System.out.println("Second map: " + stringTChars);

        return stringSChars.equals(stringTChars);
    }
}
