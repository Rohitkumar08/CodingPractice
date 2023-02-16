package Matrix;

public class LargestIsland {
    boolean[][] seen;
    int[][] grid;

    public static void main(String[] args) {
        LargestIsland li = new LargestIsland();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        long sec = System.currentTimeMillis();
        System.out.println(li.maxAreaOfIsland(grid));
        System.out.println("time taken by recursive dfs : "+
                (System.currentTimeMillis()-sec));
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int m = grid.length;
        int n = grid[0].length;

        seen = new boolean[m][n];

        int maxArea = 0;

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                maxArea = Math.max(maxArea, maxAreaByDFS(i, j));
            }
        }
        return maxArea;
    }

    public int maxAreaByDFS(int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || seen[i][j] || grid[i][j]==0){
            return 0;
        }
        seen[i][j] = true;
        return (1+ maxAreaByDFS(i+1, j) + maxAreaByDFS(i-1, j) + maxAreaByDFS(i,  j+1) + maxAreaByDFS(i, j-1));

    }
}
