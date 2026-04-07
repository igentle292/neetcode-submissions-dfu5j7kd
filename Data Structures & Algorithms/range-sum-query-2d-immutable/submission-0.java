class NumMatrix {

    int[][] my_matrix;
    int[][] postfix_matrix; //rows

    public NumMatrix(int[][] matrix) {
        my_matrix = matrix;
        postfix_matrix = new int[matrix.length][matrix[0].length];
        for(int i=0; i<postfix_matrix.length; i++){
            for(int j=matrix[i].length - 2; j>=0; j--){
                postfix_matrix[i][j] = postfix_matrix[i][j+1] + my_matrix[i][j+1];
            }
        }
    }
    //create postfix row matrix
    //calculate sum by using postfix of left and right for each row
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;
        for(int i=row1; i<=row2; i++){
            result += postfix_matrix[i][col1] - postfix_matrix[i][col2] + my_matrix[i][col1];
        }
        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */