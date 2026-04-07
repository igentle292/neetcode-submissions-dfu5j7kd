class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }

        int[] sums = new int[amount + 1];
        for(int i=0; i<sums.length; i++){
            sums[i] = 10001;                    //greater than possible amount
        }
        sums[0] = 0;

        Set<Integer> coin_set = new HashSet<>();
        for(int coin : coins){
            if(amount == coin){
                return 1;
            } else if(coin < amount){
                coin_set.add(coin);
                sums[coin] = 1;
            }
        }

//in i loop, go through every value in coins, subtract from i, and check for val of remainder
//if( i - coin val < 0) skip


        for(int i=1; i<=amount; i++){
            if(sums[i] != 1){
                for(int coin : coins){
                    if(i - coin >= 0){
                        sums[i] = Math.min(sums[i], 1 + sums[i - coin]);
                    }
                }
            }
        }

        if(sums[amount] == 10001){
            return -1;
        } else{
            return sums[amount];
        }

    }
}
