class Solution {
    public int rob(int[] nums) {
        int x1 = 0;
        int x2 = 0;

        for(int num : nums){
            int curr = Math.max(num + x1, x2);
            x1 = x2;
            x2 = curr;
        }
        return x2;
    }
}
