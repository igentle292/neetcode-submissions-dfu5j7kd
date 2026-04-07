class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        Queue<Character> prev_chars = new LinkedList<>();
        int longest = 1;
        prev_chars.add(s.charAt(0));
        for(int i=0; i<s.length() && longest < s.length() - i; i++){
            boolean noDupes = true;
            // prev_chars.add(s.charAt(i));

            for(int j=i+prev_chars.size(); j<s.length() && noDupes; j++){
                if(prev_chars.contains(s.charAt(j))){
                    noDupes = false;
                } else{
                    prev_chars.add(s.charAt(j));
                    if(j - i + 1 > longest){
                        longest = j - i + 1;
                    }
                }
                
            }
            prev_chars.remove();

        //     if(prev_chars.contains(s.charAt(i))){

        //     } else{
        //         longest++;
        //         prev_chars.add(s.charAt(i));
        //     }
        }
        return longest;
    }
}
