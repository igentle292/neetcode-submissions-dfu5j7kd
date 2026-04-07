class Solution {
    public int missingNumber(int[] nums) {
        int expected_sum = 0;
        int actual_sum = 0;
        int i = 0;
        while(i<nums.length){
            expected_sum += i;
            actual_sum += nums[i];
            i++;
        }
        expected_sum += i;
        return expected_sum - actual_sum;
    }
}
