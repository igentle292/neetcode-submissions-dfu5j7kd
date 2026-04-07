class Solution {
    public int[] plusOne(int[] digits) {
        boolean allNines = true;
        for(int digit : digits){
            if(digit != 9){
                allNines = false;
                break;
            }
        }

        // int[] result;
        if(allNines){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else{
            int i=digits.length - 1;
            while(digits[i] + 1 > 9){
                digits[i] = 0;
                i--;
            }
            digits[i]++;
            return digits;
        }

        // return result;
    }
}
