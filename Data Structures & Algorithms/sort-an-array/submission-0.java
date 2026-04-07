class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length > 1){
            int[] left = getLeft(nums);
            int[] right = getRight(nums);
            left = sortArray(left);
            right = sortArray(right);
            merge(nums, left, right);
        }
        return nums;
    }

    public static int[] getLeft(int[] nums){
        int size = nums.length / 2;
        int[] result = new int[size];
        for(int i=0; i<size; i++){
            result[i] = nums[i];
        }
        return result;
    }

    public static int[] getRight(int[] nums){
        int size = nums.length - nums.length / 2;
        int[] result = new int[size];
        for(int i=nums.length/2; i<nums.length; i++){
            result[i - nums.length/2] = nums[i];
        }
        return result;
    }

    public static void merge(int[] nums, int[] left, int[] right){
        int i=0;
        int l=0;
        int r=0;
        while(l < left.length && r < right.length){
            if(left[l] <= right[r]){
                nums[i] = left[l];
                l++;
            } else{
                nums[i] = right[r];
                r++;
            }
            i++;
        }

        while(l < left.length){
            nums[i] = left[l];
            i++;
            l++;
        }

        while(r < right.length){
            nums[i] = right[r];
            i++;
            r++;
        }
    }
}