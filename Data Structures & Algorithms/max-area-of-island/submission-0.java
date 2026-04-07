class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        List<int[]> island_coordinates = new ArrayList<>();
        int max_area = 0;
        // int island_count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    int[] coords = {i,j};
                    if(!listContainsPair(island_coordinates, coords)){
                        int prev_size = island_coordinates.size();
                        // System.out.println("adding coord, checking adjacent");
                        island_coordinates.add(coords);
                        checkAdjacent(grid, island_coordinates, i, j);
                        // island_count++;
                        max_area = Math.max(island_coordinates.size() - prev_size, max_area);
                    }
                }
            }
        }
        // return island_count;
        return max_area;
    }

    public void checkAdjacent(int[][] grid, List<int[]> other_coordinates, int i, int j){
        // System.out.println("i: " + i + " j: " + j);
        //check up
        int[] coords1 = {i-1,j};
        if(i - 1 >= 0 && !listContainsPair(other_coordinates, coords1) && grid[i - 1][j] == 1){
            other_coordinates.add(coords1);
            checkAdjacent(grid, other_coordinates, i-1, j);
        }
        //check down
        int[] coords2 = {i+1,j};
        if(i + 1 < grid.length && !listContainsPair(other_coordinates, coords2) && grid[i + 1][j] == 1){
            other_coordinates.add(coords2);
            checkAdjacent(grid, other_coordinates, i+1, j);
        }
        //check left
        int[] coords3 = {i,j-1};
        if(j - 1 >= 0 && !listContainsPair(other_coordinates, coords3) && grid[i][j - 1] == 1){
            other_coordinates.add(coords3);
            checkAdjacent(grid, other_coordinates, i, j-1);
        }
        //check right
        int[] coords4 = {i,j+1};
        if(j + 1 < grid[i].length && !listContainsPair(other_coordinates, coords4) && grid[i][j + 1] == 1){
            other_coordinates.add(coords4);
            checkAdjacent(grid, other_coordinates, i, j+1);
        }
        //if coordinate is valid, and is a 1, add to int[] list
    }

    public boolean listContainsPair(List<int[]> coordinates, int[] pair){
        for(int[] coords : coordinates){
            if(Arrays.equals(coords, pair)){
                return true;
            }
        }
        return false;
    }
}
