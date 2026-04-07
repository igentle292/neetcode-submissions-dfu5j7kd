class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort list, iterate through, calculate 3 sum
        //check prev element in arr if equal to curr, if eq skip
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            } else{
                List<List<Integer>> two_sum = twoSum(nums, (0 - nums[i]), i + 1);
                if(two_sum != null){
                    for(List<Integer> that_list : two_sum){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(nums[i]);
                        for(int num : that_list){
                            sum.add(nums[num]);
                        }
                        results.add(sum);
                    }
                }
            }
        }

        return results;
    }

    public List<List<Integer>> twoSum(int[] numbers, int target, int start) {
        int left = start;
        int right = numbers.length - 1;
        List<List<Integer>> results = null;

        while(right > left){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                List<Integer> whatever = new ArrayList<>();
                whatever.add(left);
                whatever.add(right);
                if(results == null){
                    results = new ArrayList<>();
                }
                results.add(whatever);

                left++;
                while(numbers[left] == numbers[left - 1] && left < right){
                    left++;
                }
                // return new int[]{left, right};
            } else{
                if(sum > target){
                    right--;
                } else{
                    left++;
                }
            }

        }

        return results;
    }
}
