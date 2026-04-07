class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        } else if(x <= 4){
            return x / 2;
        } else{
            long lower = 1;
            long upper = Math.min(46341, x / 2);

            //check number in middle, if num ^ 2 is <= x, AND (num + 1)^2 > x, return num
            //if num^2 is > x, go to lower half
            //if num^2 < x AND (num + 1)^2 < x, go to upper half
            while(true){
                if(lower != 1 && lower * lower <= x && (lower + 1) * (lower + 1) > x){
                    return (int) lower;
                }

                if(upper * upper <= x && (upper + 1) * (upper + 1) > x){
                    return (int) upper;
                }

                long mid = (lower + upper) / 2;
                System.out.println("Mid: " + mid);

                if(mid * mid <= x && (mid + 1) * (mid + 1) > x){
                    return (int) mid;
                }

                if(mid * mid > x){
                    upper = mid + 1;
                } else if(mid * mid < x){
                    lower = mid + 1;
                }
            }
        }
    }
}