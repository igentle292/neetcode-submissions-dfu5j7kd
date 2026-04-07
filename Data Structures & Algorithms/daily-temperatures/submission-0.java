class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1){
            return new int[1];
        }
        Stack<Integer> prev_temps = new Stack<>();  //store indices
        int[] results = new int[temperatures.length];
        prev_temps.push(0);
        for(int i=1; i<temperatures.length; i++){
            if(!prev_temps.empty() && temperatures[i] > temperatures[prev_temps.peek()]){
                int num_idx = prev_temps.peek();
                while(!prev_temps.empty() && temperatures[i] > temperatures[num_idx]){
                    num_idx = prev_temps.pop();
                    results[num_idx] = i - num_idx;
                    if(!prev_temps.empty()){
                        num_idx = prev_temps.peek();
                    }
                }
            }
            prev_temps.push(i);
        }

        return results;
    }
}
