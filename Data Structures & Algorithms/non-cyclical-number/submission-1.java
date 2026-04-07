class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        } else{
            Set<Integer> prev_nums = new HashSet();
            int test = n;
            
            while(test != 1 && !prev_nums.contains(test)){
                // System.out.println("test: " + test);
                prev_nums.add(test);
                int sum = 0;
                int temp = test;
                while(temp != 0){
                    int remainder = temp % 10;
                    sum += (remainder * remainder);
                    temp = temp / 10;
                }
                // System.out.println("sum: " + sum);
                // prev_nums.add(sum);
                test = sum;
            }
            return test == 1;
        }
    }
}
