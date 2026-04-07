class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for(int num : nums){
            num_set.add(num);
        }
        
        int[] unique_nums = new int[num_set.size()];

        int i=0;
        for(int num : num_set){
            unique_nums[i] = num;
            i++;
        }
        Arrays.sort(unique_nums);
        for(int j=0; j<unique_nums.length; j++){
            nums[j] = unique_nums[j]; 
        }
        return num_set.size();
    }
}