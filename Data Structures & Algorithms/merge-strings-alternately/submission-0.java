class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int l=0;
        int r=0;
        char[] result = new char[word1.length() + word2.length()];
        while(l<word1.length() && r<word2.length()){
            if(i % 2 == 0){
                result[i] = word1.charAt(l);
                l++;
            } else{
                result[i] = word2.charAt(r);
                r++;
            }
            i++;
        }

        while(l<word1.length()){
            result[i] = word1.charAt(l);
            l++;
            i++;
        }

        while(r<word2.length()){
            result[i] = word2.charAt(r);
            r++;
            i++;
        }

        return new String(result);
    }
}