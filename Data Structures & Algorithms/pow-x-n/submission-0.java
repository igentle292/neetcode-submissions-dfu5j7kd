class Solution {
    public double myPow(double x, int n) {
        if(x == 0 || x == 1 || n == 1){
            return x;
        } else if(n == 0){
            return 1;
        } else{
            //get abs val of n, calcuate num, if n is negative return 1/calc, else return calc
            int absolute_value_n = n;
            double value = x;
            if(n < 0){
                absolute_value_n *= -1;
            }

            for(int i=1; i < absolute_value_n; i++){
                value *= x;
            }

            if(n < 0){
                return 1 / value;
            } else{
                return value;
            }
        }
    }
}
