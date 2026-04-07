class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_length = nums.length * 2;
        int[] result = new int[new_length];
        
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }

        return result;
    }
}