class Solution {
    public int removeElement(int[] nums, int val) {
        boolean removedElement = false;
        List<Integer> newNums = new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                newNums.add(nums[i]);
            } else{
                removedElement = true;
            }
        }

        if(removedElement){
            for(int i=0; i<newNums.size(); i++){
                nums[i] = newNums.get(i);
            }
            return newNums.size();
        } else{
            return nums.length;
        }
    }
}