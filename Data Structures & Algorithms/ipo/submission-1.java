class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        //go through capital and add new eligible elements to heap
        //heap sorts based on profits
        //use top available profit, calculate
        //update current capital, repeat adding new elements to heap

        int prev_capital = -1;
        int current_capital = w;


        //heap object???
        PriorityQueue<Integer> profit_heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<k; i++){
            for(int j=0; j<profits.length; j++){
                if(capital[j] > prev_capital && capital[j] <= current_capital){
                    //add to heap
                    profit_heap.add(profits[j]);
                }
            }

            //extract top value of heap
            if(!profit_heap.isEmpty()){
                int heap_val = profit_heap.poll();
                System.out.println("Adding: " + heap_val + " to capital");
                prev_capital = current_capital;
                current_capital += heap_val;
            } else{
                return current_capital;
            }
            

        }

        return current_capital;
    }
}