package Matrix;

public class NoOfIslands {

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 } };
        System.out.println(countNoOfIsland(mat));
    }


    public static int countNoOfIsland(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int count = 0;
        boolean[][] visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==1 && !visited[i][j]){
                    callDFS(mat, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isSafe(int[][] mat, int i, int j, boolean[][] visited){
        return (i>=0 && j>=0 && i<mat.length && j <mat[0].length && !visited[i][j] && mat[i][j]==1);
    }

    static int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};

    /**
     * O(n*m)  complexity
     * @param mat
     * @param i
     * @param j
     * @param visited
     */
    private static void callDFS(int[][] mat, int i, int j, boolean[][] visited) {

        visited[i][j] = true;

        for(int k=0; k<rowDir.length; k++){
            if(isSafe(mat, i+rowDir[k], j+colDir[k], visited)){
                callDFS(mat, i+rowDir[k], j+colDir[k], visited);
            }
        }

    }
}
