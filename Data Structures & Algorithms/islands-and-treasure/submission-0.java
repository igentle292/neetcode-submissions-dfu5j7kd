class Solution {
    public void islandsAndTreasure(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 0){
                    search(i, j, grid);
                }
            }
        }
    }

    public void search(int i, int j, int[][] grid){
        //bfs, check all neighbors if greater than curr_val + 1
        int curr = grid[i][j];
        if(i-1 >= 0 && grid[i-1][j] > (curr + 1)){
            grid[i-1][j] = curr + 1;
            search(i-1, j, grid);
        }

        if(i+1 < grid.length && grid[i+1][j] > (curr + 1)){
            grid[i+1][j] = curr + 1;
            search(i+1, j, grid);
        }

        if(j-1 >= 0 && grid[i][j-1] > (curr + 1)){
            grid[i][j-1] = curr + 1;
            search(i, j-1, grid);
        }

        if(j+1 < grid[i].length && grid[i][j+1] > (curr + 1)){
            grid[i][j+1] = curr + 1;
            search(i, j+1, grid);
        }
    }
}
