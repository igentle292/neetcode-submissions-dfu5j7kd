class MinStack {
    // private Integer min;
    private Stack<Integer> numbers;
    private TreeMap<Integer, Integer> number_map; //value, occurences

    public MinStack() {
        numbers = new Stack<>();
        number_map = new TreeMap<>();
        // min = null;
    }
    
    public void push(int val) {
        // if(min == null){
        //     min = val;
        // } else{
        //     if(val < min){
        //         min = val;
        //     }
        // }
        numbers.push(val);
        Integer returned = number_map.putIfAbsent(val, 1);
        if(returned != null){
            number_map.replace(val, returned + 1);
        }
    }
    
    public void pop() {
        int removed_num = numbers.pop();
        if(number_map.get(removed_num) == 1){
            number_map.remove(removed_num);
        } else{
            number_map.replace(removed_num, number_map.get(removed_num) - 1);
        }
    }
    
    public int top() {
        return numbers.peek();
    }
    
    public int getMin() {
        return number_map.firstKey();
    }
}
