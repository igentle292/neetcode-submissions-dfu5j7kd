class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k;
        while(rotate >= nums.length){
            rotate -= nums.length;
        }

        if(rotate == 0){
            return;
        }
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int rot_counter = (i + k) % nums.length;
            result[rot_counter] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
    }
}