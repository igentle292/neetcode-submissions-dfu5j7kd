class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> num_set = new HashSet<>();
        // for(int num : nums){
        //     if(num_set.contains(num)){
        //         return num;
        //     }
        //     num_set.add(num);
        // }
        // return 0;



        // int max = -1;
        // int actual_sum = 0;
        // int expected_sum;
        // for(int num : nums){
        //     max = Math.max(max, num);
        //     actual_sum += num;
        // }
        // expected_sum = ((max + 1) * max) / 2;

        // return (actual_sum - expected_sum) / (nums.length - max);


        // floyds alg, linked list: 
        //step 1: go from index 0, and go nums[index] at each num. use fast(2 step) and slow(1 step) pointers
        // stop when they are at the SAME value
        //step 2: create a new slow pointer at start. increment both slow pointers until they are at the same value
        int fast = 0;
        int slow = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        int second_slow = 0;
        while(slow != second_slow){
            slow = nums[slow];
            second_slow = nums[second_slow];
        }
        return slow;
    }
}
