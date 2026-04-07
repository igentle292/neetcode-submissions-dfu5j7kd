class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }

        HashMap<Integer, Integer> numFrequency = new HashMap();
        int[] frequent_elements = new int[k];
        // number, appearances
        for(int num : nums){
            if(numFrequency.putIfAbsent(num, 1) != null){
                numFrequency.replace(num, numFrequency.get(num) + 1);
            }
        }

        int counter = 0;
        int frequent_int = 0;
        int frequent_count = 0;
        
        while(counter < k){
            for(Map.Entry<Integer, Integer> entry : numFrequency.entrySet()){
                if(entry.getValue() > frequent_count){
                    frequent_count = entry.getValue();
                    frequent_int = entry.getKey();
                }
            }
            numFrequency.remove(frequent_int, frequent_count);
            frequent_elements[counter] = frequent_int;
            frequent_int = 0;
            frequent_count = 0;
            counter++;
        }

        return frequent_elements;
    }
}
