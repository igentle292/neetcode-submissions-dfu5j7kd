class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }

        if(stones.length > 2){
            List<Integer> stone_list = new ArrayList<>();
            for(int stone : stones){
                stone_list.add(stone);
            }
            
            while(stone_list.size() > 1){
                Collections.sort(stone_list);
                Collections.reverse(stone_list);
                
                int max1 = stone_list.get(0);
                int max2 = stone_list.get(1);
                if(max1 - max2 == 0){
                    stone_list.remove(1);
                    stone_list.remove(0);
                } else{
                    int new_element = max1 - max2;
                    stone_list.remove(1);
                    stone_list.remove(0);
                    stone_list.add(new_element);
                }

            }
            return stone_list.size() == 0 ? 0 : stone_list.get(0);

        } else{
            return Math.abs(stones[0] - stones[1]);
        }
    }
}
