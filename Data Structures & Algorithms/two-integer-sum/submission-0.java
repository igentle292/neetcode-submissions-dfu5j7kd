class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2){
            return new int[] {0,1};
        }
        HashMap<Integer, Integer> sums = new HashMap();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(sums.containsKey(complement)){
                return new int[] {sums.get(complement), i};
            } else{
                sums.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }
}


//
//check if complement exists, if so, get complement index, and return that with current index
//else, store number, index 