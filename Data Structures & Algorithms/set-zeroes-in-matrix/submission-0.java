class Solution {
    public void setZeroes(int[][] matrix) {
        //create binary numbers for rows and cols
        //1s mean that row has zeros, 0 means no
        long row_num = 0;
        long row_num2 = 0;
        long col_num = 0;
        long col_num2 = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(i > 63){
                        int digit = i % 64;
                        row_num2 = row_num2 | (1 << digit);
                    } else{
                        row_num = row_num | (1 << i);
                    }

                    if(j > 63){
                        int digit = j % 64;
                        col_num2 = col_num2 | (1 << digit);
                    } else{
                        col_num = col_num | (1 << j);
                    }
                }
            }
        }
        
        for(int i=0; i<64 && (row_num != 0 || col_num != 0); i++){
            if(row_num != 0){
                if(((row_num >> i) & 1) == 1){
                    for(int j=0; j<matrix[i].length; j++){
                        matrix[i][j] = 0;
                    }
                }
            }

            if(col_num != 0){
                if(((col_num >> i) & 1) == 1){
                    for(int j=0; j<matrix.length; j++){
                        matrix[j][i] = 0;
                    }
                }
            }
        }

        for(int i=0; i<40 && (row_num2 != 0 || col_num2 != 0); i++){
            if(row_num2 != 0){
                if(((row_num2 >> i) & 1) == 1){
                    for(int j=0; j<matrix[i + 64].length; j++){
                        matrix[i+64][j] = 0;
                    }
                }
            }

            if(col_num2 != 0){
                if(((col_num2 >> i) & 1) == 1){
                    for(int j=0; j<matrix.length; j++){
                        matrix[j][i+64] = 0;
                    }
                }
            }
        }
    }
}
