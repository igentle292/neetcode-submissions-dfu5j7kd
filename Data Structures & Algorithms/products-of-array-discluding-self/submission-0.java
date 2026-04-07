class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;
        boolean have_mult_zeros = false;
        for(int i=0; i<nums.length; i++){
            product *= nums[i];
            if(nums[i] == 0){
                zeros++;
                if(zeros > 1){
                    have_mult_zeros = true;
                }
            }
        }

        int[] result = new int[nums.length];
        if(!have_mult_zeros){
            for(int i=0; i<result.length; i++){
                if(nums[i] == 0){
                    // System.out.println("one zero found");
                    int new_product = 1;
                    for(int j=0; j<nums.length; j++){
                        if(j != i){
                            new_product *= nums[j];
                        }
                    }
                    result[i] = new_product;
                } else{
                    result[i] = product / nums[i];
                }
            }
        }
        return result;
        
    }
}  
