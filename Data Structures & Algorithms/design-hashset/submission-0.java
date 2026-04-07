class MyHashSet {
    private List<Integer> nums;

    public MyHashSet() {
        nums = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!this.contains(key)){
            nums.add((Integer) key);
        }
    }
    
    public void remove(int key) {
        if(this.contains(key)){
            nums.remove((Integer) key);
        }
    }
    
    public boolean contains(int key) {
        return nums.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */