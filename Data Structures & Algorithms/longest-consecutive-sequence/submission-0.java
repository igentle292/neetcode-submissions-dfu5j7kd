class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }

        int max_count = 1;

        for(int num : numbers){
            if(!numbers.contains(num - 1)){
                int count = 1;
                int next = num + 1;
                while(numbers.contains(next)){
                    count++;
                    next++;
                }
                if(count > max_count){
                    max_count = count;
                }
            }
        }

        return max_count;
        
    }
}
