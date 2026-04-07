class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int checks = 0;
        if(k >= nums.length){
            checks = 1;
        } else{
            checks = nums.length - k + 1;
        }
        System.out.println(checks);
        Set<Integer> num_set = new HashSet<>();
        for(int num : nums){
            num_set.add(num);
        }
        if(num_set.size() == nums.length){
            return false;
        }

        List<Integer> prev_ints = new ArrayList<>();
        for(int i=0; i<checks; i++){
            
            for(int j=i; j<=i+k && j<nums.length; j++){
                if(prev_ints.contains(nums[j])){
                    return true;
                } else{
                    prev_ints.add(nums[j]);
                }
            }
            prev_ints.clear();
        }
        return false;
    }
}