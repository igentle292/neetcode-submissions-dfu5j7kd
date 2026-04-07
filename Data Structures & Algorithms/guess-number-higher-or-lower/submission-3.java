/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long lower = 1;
        long upper = n;

        if(lower == upper){
            return 1;
        }

        long mid;
        boolean found = false;
        while(!found){
            if(guess((int) lower) == 0){
                found = true;
                return (int) lower;
            } else if(guess((int) upper) == 0){
                found = true;
                return (int) upper;
            }

            mid = (upper + lower) / 2;
            System.out.println("Mid: " + mid);
            int result = guess((int) mid);

            if(result == 0){
                found = true;
                return (int) mid;
            } else if(result > 0){
                lower = (int) mid;
            } else{
                upper = (int) mid;
            }


        }

        return 0;
        //  int lower = 0;
        // int upper = nums.length;

        // if(nums[lower] == target){
        //         return lower;
        // } else if(nums[upper - 1] == target){
        //     return upper - 1;
        // }

        // int mid = 0;
        // while(lower <= upper && lower < (nums.length - 1) && upper >= 0){
        //     if(upper < nums.length && nums[upper] == target){
        //         return upper;
        //     } else if(nums[lower] == target){
        //         return lower;
        //     }
            
        //     mid = (upper - lower) / 2;
        //     if(mid < lower){
        //         mid = lower;
        //     } else if(mid > upper){
        //         mid = upper;
        //     }

        //     System.out.println("Mid: " + mid);

        //     if(nums[mid] == target){
        //         return mid;
        //     }

        //     if(nums[mid] < target){
        //         lower = mid + 1;
        //     } else{
        //         upper = mid - 1;
        //     }
        // }
        // if(nums[mid] != target){
        //     return -1;
        // } else{
        //     return mid;
        // }
    }
}