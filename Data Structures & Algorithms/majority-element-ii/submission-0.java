class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 1){
            List<Integer> result = new ArrayList<>();
            result.add(nums[0]);
            return result;
        } else if(nums.length == 2){
            if(nums[0] == nums[1]){
                List<Integer> result = new ArrayList<>();
                result.add(nums[0]);
                return result;
            } else{
                List<Integer> result = new ArrayList<>();
                result.add(nums[0]);
                result.add(nums[1]);
                return result;
            }
        }


        int min_frequency = nums.length / 3;
        int max_frequency = 0;
        Integer most_common = null;
        Map<Integer, Integer> frequency_map = new HashMap<>();  //number -> frequency
        for(int num : nums){
            Integer result = frequency_map.putIfAbsent(num, 1);
            if(result != null){
                frequency_map.replace(num, result + 1);
                if((result + 1) > max_frequency){
                    max_frequency = result + 1;
                    most_common = num;
                }
                max_frequency = Math.max((result + 1), max_frequency);
            }
        }

        if(max_frequency > min_frequency){
            //calculations
            List<Integer> result = new ArrayList<>();
            result.add(most_common);
            frequency_map.remove(most_common);
            for(Map.Entry<Integer, Integer> entry : frequency_map.entrySet()){
                if(entry.getValue() > min_frequency){
                    result.add(entry.getKey());
                }
            }
            return result;
        } else{
            return Collections.<Integer>emptyList();
        }
    }
}