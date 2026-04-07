class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> prevNums = new HashSet();
        for(int number : nums){
            if(prevNums.contains(number)){
                return true;
            } else{
                prevNums.add(number);
            }
        }
        return false;
    }
}