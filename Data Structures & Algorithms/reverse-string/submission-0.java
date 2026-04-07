class Solution {
    public void reverseString(char[] s) {
        int half = s.length / 2;
        for(int i=0; i<half; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}