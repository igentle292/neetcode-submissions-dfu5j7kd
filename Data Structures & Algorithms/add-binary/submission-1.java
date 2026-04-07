class Solution {
    public String addBinary(String a, String b) {
        long int_a = Long.parseLong(a, 2);
        long int_b = Long.parseLong(b, 2);
        long result = int_a + int_b;
        return Long.toBinaryString(result);
    }
}