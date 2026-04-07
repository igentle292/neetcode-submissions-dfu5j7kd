class Solution {
    public int tribonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        } else if(n == 2){
            return 1;
        }

        int[] results = new int[n + 1];
        results[0] = 0;
        results[1] = 1;
        results[2] = 1;

        for(int i=3; i<results.length; i++){
            results[i] = results[i-1] + results[i-2] + results[i-3];
        }

        return results[n];
    }
}