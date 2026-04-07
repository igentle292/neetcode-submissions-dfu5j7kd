class Solution {
    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int rot_counter = (i + k) % nums.length;
            result[rot_counter] = nums[i];
        }
        System.out.println(Arrays.toString(result));

        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }
    }
}