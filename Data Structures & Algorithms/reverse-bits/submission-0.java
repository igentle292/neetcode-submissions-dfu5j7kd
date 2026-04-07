class Solution {
    public int reverseBits(int n) {
        char[] str = Integer.toBinaryString(n).toCharArray();
        for(int i=0; i<str.length/2; i++){
            char temp_char = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp_char;
        }
        int zeros = 32 - str.length;
        String result = new String(str);
        for(int i=0; i<zeros; i++){
            result = result.concat("0");
        }
        // System.out.println(Long.parseLong(result, 2));
        return Integer.parseUnsignedInt(result, 2);
        // return 0;
    }
}
