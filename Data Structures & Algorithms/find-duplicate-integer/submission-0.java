class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for(int num : nums){
            if(num_set.contains(num)){
                return num;
            }
            num_set.add(num);
        }
        return 0;
    }
}
