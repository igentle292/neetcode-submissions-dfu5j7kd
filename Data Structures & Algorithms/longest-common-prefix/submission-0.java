class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            int next_check = Math.min(prefix.length(), strs[i].length());
            if(next_check == 0){
                return "";
            }
            int prefix_length = 0;
            boolean stillValid = true;
            while(prefix_length < next_check && stillValid){
                if(prefix.charAt(prefix_length) == strs[i].charAt(prefix_length)){
                    prefix_length++;
                } else{
                    stillValid = false;
                }
            }

            if(prefix_length > 0){
                if(prefix_length != prefix.length()){
                    prefix = prefix.substring(0, prefix_length);
                }
            } else{
                return "";
            }
        }

        return prefix;
    }
}