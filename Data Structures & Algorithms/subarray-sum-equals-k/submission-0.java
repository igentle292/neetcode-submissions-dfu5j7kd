class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefix_map = new HashMap<>();
        int result = 0;
        int sum = 0;
        prefix_map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum - k;
            result += prefix_map.getOrDefault(remainder, 0);

            Integer ret_val = prefix_map.putIfAbsent(sum, 1);
            if(ret_val != null){
                prefix_map.replace(sum, ret_val + 1);
            }
        }

        return result;
    }
}