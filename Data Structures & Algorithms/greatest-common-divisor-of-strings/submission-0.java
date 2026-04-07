class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String con_str = str1 + str2;
        String cat_str = str2 + str1;
        if(con_str.equals(cat_str)){
            //calc gcd of str lengths
            int small_num = Math.min(str1.length(), str2.length());
            int big_num = Math.max(str1.length(), str2.length());
            return str1.substring(0, gcd(big_num, small_num));
        }

        return "";
    }

    public int gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}