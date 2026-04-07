class Solution {
    public String multiply(String num1, String num2) {
        long int1 = 0;
        long int2 = 0;

        for(int i=0; i<num1.length(); i++){
            int1 *= 10;
            int1 += num1.charAt(i) - '0';
        }

        for(int i=0; i<num2.length(); i++){
            int2 *= 10;
            int2 += num2.charAt(i) - '0';
        }

        long result = int1 * int2;
        return Long.toString(result);
    }
}
