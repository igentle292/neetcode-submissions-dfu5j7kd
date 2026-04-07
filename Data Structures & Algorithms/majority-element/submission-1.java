class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int result = nums[0];
        int frequency = 1;
        Map<Integer, Integer> numFrequency = new HashMap<>();
        for(int num: nums){
            Integer prev_value = numFrequency.putIfAbsent(num, 1);
            if(prev_value != null){
                numFrequency.replace(num, prev_value + 1);
                if(prev_value + 1 > frequency){
                    frequency = prev_value + 1;
                    result = num;
                }
            }
        }

        // for(Map.Entry<Integer, Integer> entry : numFrequency.entrySet()){
        //     if(entry.getValue() > frequency){
        //         result = entry.getKey();
        //         frequency = entry.getValue();
        //     }
        // }

        return result;
    }
}