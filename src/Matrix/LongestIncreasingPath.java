package Matrix;

public class LongestIncreasingPath {

    public static void main(String[] args) {
        int[][] mat = {{15,10,2,1,8,3},{5,4,4,0,19,3},{4,7,0,6,15,11},{18,4,8,1,0,12},{19,7,16,10,7,19},{1,3,9,15,3,17},{2,8,8,3,4,5},{11,18,19,2,8,14},{0,10,2,8,12,3},{1,8,2,13,17,2},{2,2,5,9,5,5},{0,2,6,5,5,16},{4,1,17,5,7,10},{7,1,9,9,10,17},{1,7,15,12,6,3},{18,17,6,8,13,1},{11,5,15,5,16,1},{12,16,10,7,18,13},{9,3,13,11,6,11},{5,8,2,13,0,0},{4,14,19,11,4,1},{17,19,0,10,7,9},{9,6,0,5,19,3},{1,1,16,0,10,0},{2,12,19,1,4,1},{17,4,18,13,13,3},{0,16,3,17,18,16},{9,8,17,6,11,5},{4,6,15,2,18,11},{17,4,11,4,1,15},{10,7,6,8,6,9},{3,6,5,7,17,0},{14,8,4,7,15,15},{15,15,11,7,2,16}};
        LongestIncreasingPath pathClass = new LongestIncreasingPath();
        System.out.println(pathClass.path(mat));
    }

//    public static int path(int[][] mat){
//        int n= mat.length;
//        int m = mat[0].length;
//        if(n==1 && m==1){
//            return 1;
//        }
//
//        int maxLength =0;
//
//        int[][] memo = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                int currLength = getMaxPath(mat, i, j, -1, memo);
//                if(currLength>maxLength){
//                    maxLength= currLength;
//                }
//            }
//        }
//        return maxLength;
//    }
//
//    public static boolean isSafe(int[][] mat, int i, int j, int prevElem){
//         return (i>=0 && j>=0 && i<mat.length && j<mat[0].length && prevElem<mat[i][j]);
//    }
//
//    private static int getMaxPath(int[][] mat, int i, int j, int prevElem, int[][] memo) {
//        if(!isSafe(mat, i, j, prevElem)){
//            return 0;
//        }
//        if(memo[i][j] != 0) return memo[i][j];
//
//        int newPrev = mat[i][j];
//
//        int bottom = getMaxPath(mat, i+1, j, newPrev, memo);
//        int right = getMaxPath(mat, i, j + 1, newPrev, memo);
//        int top = getMaxPath(mat, i-1, j, newPrev, memo);
//        int left = getMaxPath(mat, i, j-1, newPrev, memo);
//
//
//        int max = top;
//        max = Math.max(max, bottom);
//        max = Math.max(max, left);
//        max = Math.max(max, right);
//        memo[i][j] = max+1;
//        return memo[i][j];
//
//    }






    public int path(int[][] mat) {
        int n= mat.length;
        int m = mat[0].length;
        if(n==1 && m==1){
            return 1;
        }

        int maxLength =0;
        boolean[][] visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int currLength = getMaxPath(mat, i, j, visited, -1, 0, 0);
                if(currLength>maxLength){
                    maxLength= currLength;
                }
            }
        }
        return maxLength+1;
    }

    public  boolean isSafe(int[][] mat, int i, int j, boolean[][] visited, int prevElem){
        if(i>=0 && j>=0 && i<mat.length && j<mat[0].length && !visited[i][j] && prevElem<mat[i][j]){
           return true;
        }
        return false;
    }

    private  int getMaxPath(int[][] mat, int i, int j, boolean[][] visited, int prevElem, int dist, int currLength) {
        if(!isSafe(mat, i, j, visited, prevElem)){
            return dist;
        }

        visited[i][j] = true;
        currLength =Math.max(currLength, dist);

        int newPrev = mat[i][j];
        if(isSafe(mat, i+1, j, visited, newPrev)){
            currLength = getMaxPath(mat, i+1, j, visited, newPrev, dist+1, currLength);
        }
        // go to the right cell
        if (isSafe(mat, i, j+1, visited, newPrev)) {
            currLength = getMaxPath(mat, i, j + 1, visited, newPrev, dist + 1, currLength);
        }
        // go to the top cell
        if (isSafe(mat, i-1, j, visited, newPrev)) {
            currLength = getMaxPath(mat, i-1, j , visited, newPrev, dist + 1, currLength);
        }
        // go to the left cell
        if (isSafe(mat, i, j-1, visited, newPrev)) {
            currLength = getMaxPath(mat, i, j - 1, visited, newPrev, dist + 1, currLength);
        }

        visited[i][j] = false;
        return currLength;

    }
}
