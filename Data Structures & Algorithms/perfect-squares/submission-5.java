class Solution {
    public int numSquares(int n) {
        int[] whatever = new int[n + 1];
        for(int i=0; i<whatever.length; i++){
            whatever[i] = n;
        }
        whatever[0] = 0;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int square = j * j;
                if(i - square < 0){
                    break;
                }
                whatever[i] = Math.min(whatever[i], 1 + whatever[i-square]);
            }
        }
        return whatever[n];


        // //greedy
        // int count = 0;
        // int i = 0;
        // int num = n;
        // while(num != 0){
        //     int next_square = squares.get(squares.size() - 1 - i);
        //     if(next_square <= num){
        //         System.out.print(next_square + " ");
        //         num -= next_square;
        //         count++;
        //     } else{
        //         i++;
        //     }
        // }

        // //lazy
        // for(int j=0; j<squares.size(); j++){
        //     int next_square = squares.get(squares.size() - 1 - j);
        //     if(n % next_square == 0){
        //         if(n / next_square < count){
        //             return n / next_square;
        //         } else{
        //             return count;
        //         }
        //     }
        // }

        // return count;
    }
}