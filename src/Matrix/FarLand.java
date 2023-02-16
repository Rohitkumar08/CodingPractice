package Matrix;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class FarLand {

    static int rowNum[] = {-1, 0, 0, 1};
    static int colNum[] = {0, -1, 1, 0};

    public static void main(String[] args) {
        int[][] maze = new int[][] {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println(shortestPathInMazeBruteForce(maze));
    }

    public static int shortestPathInMazeBruteForce(int[][] maze){
        int n = maze.length;
        int m = maze[0].length;
        if(maze.length==0){
            return -1;
        }
//        visited = new boolean[maze.length][maze[0].length];
//
//        for (int i = 0; i < maze.length; i++) {
//            for (int j = 0; j < maze[0].length; j++) {
//                visited[i][j] = false;
//            }
//        }

//        int dist = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(maze[i][j]==0){
//                    int currDistance = findShortesPathRecursively(maze, i, j, dist, 0);

                    int currDistance = shortestPathInMazeUsingBFS(maze, i, j);
                    if(currDistance>maxDistance){
                        maxDistance=currDistance;
                    }
                }

            }
        }
        if(maxDistance == Integer.MIN_VALUE || maxDistance == Math.abs(Integer.MIN_VALUE)-1){
            return -1;
        }
        return maxDistance;
    }

//    public static boolean isSafe(int[][] maze, boolean[][] visited, int i, int j){
//        return (i>=0 && i<maze.length && j>=0 && j<maze[0].length && !visited[i][j]);
//    }

//    private static int findShortesPathRecursively(int[][] maze, int i, int j, int minDist, int dist) {
//        if(maze[i][j] == 1 || (i ==maze.length && j==maze[0].length)){
//            minDist = Math.min(dist, minDist);
//            return minDist;
//        }
//
//        visited[i][j] = true;
//
//        if (isSafe(maze, visited, i + 1, j)) {
//            minDist = findShortesPathRecursively(maze, i + 1, j,
//                    minDist, dist + 1);
//        }
//        // go to the right cell
//        if (isSafe(maze, visited, i, j + 1)) {
//            minDist = findShortesPathRecursively(maze, i, j + 1,
//                    minDist, dist + 1);
//        }
//        // go to the top cell
//        if (isSafe(maze, visited, i - 1, j)) {
//            minDist = findShortesPathRecursively(maze, i - 1, j,
//                    minDist, dist + 1);
//        }
//        // go to the left cell
//        if (isSafe(maze, visited, i, j - 1)) {
//            minDist = findShortesPathRecursively(maze, i, j - 1,
//                    minDist, dist + 1);
//        }
//
//        visited[i][j] = false;
//        return minDist;
//    }


    /**
     * 35/37 test cases passed
     * @param maze
     * @param i
     * @param j
     * @return
     */
    public static int shortestPathInMazeUsingBFS(int[][] maze, int i, int j){
        // check source and destination cell
        // of the matrix have value 1
        int m = maze.length;
        int n = maze[0].length;
        if(maze[i][j] == 1 || (i ==maze.length && j==maze[0].length)){
            return 0;
        }

        boolean [][]visited = new boolean[m][n];

        // Mark the source cell as visited
        visited[i][j] = true;

        // Create a queue for BFS
        Queue<QueueNode> q = new LinkedList<>();
        Point src = new Point(i, j);

        // Distance of source cell is 0
        QueueNode s = new QueueNode(src, 0);
        q.add(s); // Enqueue source cell

        // Do a BFS starting from source cell
        while (!q.isEmpty())
        {
            QueueNode curr = q.peek();
            Point pt = curr.point;

            // If we have reached the destination cell,
            // we are done
            if (maze[pt.x][pt.y]==1){
                return curr.dist;
            }


            // Otherwise dequeue the front cell
            // in the queue and enqueue
            // its adjacent cells
            q.remove();

            for (int k = 0; k < 4; k++)
            {
                int row = pt.x + rowNum[k];
                int col = pt.y + colNum[k];

                // if adjacent cell is valid, has path
                // and not visited yet, enqueue it.
                if (isValid(row, col, m , n) &&
                        !visited[row][col])
                {
                    // mark cell as visited and enqueue it
                    visited[row][col] = true;
                    QueueNode Adjcell = new QueueNode
                            (new Point(row, col),
                                    curr.dist + 1 );
                    q.add(Adjcell);
                }
            }
        }

        // Return -1 if destination cannot be reached
        return -1;
    }

    static boolean isValid(int row, int col, int m, int n)
    {
        // return true if row number and
        // column number is in range
        return (row >= 0) && (row < m) &&
                (col >= 0) && (col < n);
    }


    /**
     * completely accceptable solutoion
     * @param grid
     * @return
     */
    // Four directions: Up, Down, Left and Right.
    int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maxDistance(int[][] grid) {
        // A copy matrix of the grid to mark water cells as land once visited.
        int[][] visited = new int[grid.length][grid[0].length];

        // Insert all the land cells in the queue.
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // Copy grid to the visited matrix.
                visited[i][j] = grid[i][j];
                if (grid[i][j] == 1) {
                    q.offer(new Pair(i, j));
                }
            }
        }

        int distance = -1;
        while (!q.isEmpty()) {
            int qSize = q.size();

            // Iterate over all the current cells in the queue.
            while (qSize-- > 0) {
                Pair<Integer, Integer> landCell = q.poll();

                // From the current land cell, traverse to all the four directions
                // and check if it is a water cell. If yes, convert it to land
                // and add it to the queue.
                for (int[] dir : direction) {
                    int x = landCell.getKey() + dir[0];
                    int y = landCell.getValue() + dir[1];

                    if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && visited[x][y] == 0) {
                        // Marking as 1 to avoid re-iterating it.
                        visited[x][y] = 1;
                        q.offer(new Pair(x, y));
                    }
                }
            }

            // After each iteration of queue elements, increment distance
            // as we covered 1 unit distance from all cells in every direction.
            distance++;
        }

        // If the distance is 0, there is no water cell.
        return distance == 0 ? -1 : distance;
    }
}
