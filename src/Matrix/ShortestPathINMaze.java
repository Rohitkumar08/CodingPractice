package Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathINMaze {
    static boolean[][] visited;

    public static void main(String[] args) {

        int[][] mat = new int[][] {
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };

        int[] src = {0, 0};
        int[] dest = {3, 4};
        System.out.println(shortestPathInMazeBruteForce(mat, src, dest));
    }

    public static boolean isSafe(int[][] maze, boolean[][] visited, int i, int j){
        return (i>=0 && i<maze.length && j>=0 && j<maze[0].length && maze[i][j]==1 && !visited[i][j]);
    }

    /**
     * complexity would be 4^MN exponential
     * @param maze
     * @param src
     * @param dest
     * @return
     */
    public static int shortestPathInMazeBruteForce(int[][] maze, int[] src, int[] dest){
        if(maze.length==0 || maze[src[0]][src[1]]==0 || maze[dest[0]][dest[1]]==0){
            return -1;
        }
        visited = new boolean[maze.length][maze[0].length];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                visited[i][j] = false;
            }
        }

        int dist = Integer.MAX_VALUE;
        return findShortesPathRecursively(maze, src[0], src[1], dest[0], dest[1], dist, 0);
    }

    private static int findShortesPathRecursively(int[][] maze, int i, int j, int x, int y, int minDist, int dist) {
        if(i ==x && j==y){
            minDist = Math.min(dist, minDist);
            return minDist;
        }

        visited[i][j] = true;

        if (isSafe(maze, visited, i + 1, j)) {
            minDist = findShortesPathRecursively(maze, i + 1, j, x, y,
                    minDist, dist + 1);
        }
        // go to the right cell
        if (isSafe(maze, visited, i, j + 1)) {
            minDist = findShortesPathRecursively(maze, i, j + 1, x, y,
                    minDist, dist + 1);
        }
        // go to the top cell
        if (isSafe(maze, visited, i - 1, j)) {
            minDist = findShortesPathRecursively(maze, i - 1, j, x, y,
                    minDist, dist + 1);
        }
        // go to the left cell
        if (isSafe(maze, visited, i, j - 1)) {
            minDist = findShortesPathRecursively(maze, i, j - 1, x, y,
                    minDist, dist + 1);
        }

        visited[i][j] = false;
        return minDist;
    }

    // check whether given cell (row, col)
    // is a valid cell or not.
    static boolean isValid(int row, int col)
    {
        // return true if row number and
        // column number is in range
        return (row >= 0) && (row < ROW) &&
                (col >= 0) && (col < COL);
    }

    // These arrays are used to get row and column
    // numbers of 4 neighbours of a given cell
    static int rowNum[] = {-1, 0, 0, 1};
    static int colNum[] = {0, -1, 1, 0};

    static int ROW =9;
    static int COL =9;

    /**
     * BFS SOLUTION
     * @param maze
     * @param src
     * @param dest
     * @return
     */
    public static int shortestPathInMazeUsingBFS(int[][] mat, Point src, Point dest){
        // check source and destination cell
        // of the matrix have value 1
        if (mat[src.x][src.y] != 1 ||
                mat[dest.x][dest.y] != 1)
            return -1;

        boolean [][]visited = new boolean[ROW][COL];

        // Mark the source cell as visited
        visited[src.x][src.y] = true;

        // Create a queue for BFS
        Queue<QueueNode> q = new LinkedList<>();

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
            if (pt.x == dest.x && pt.y == dest.y)
                return curr.dist;

            // Otherwise dequeue the front cell
            // in the queue and enqueue
            // its adjacent cells
            q.remove();

            for (int i = 0; i < 4; i++)
            {
                int row = pt.x + rowNum[i];
                int col = pt.y + colNum[i];

                // if adjacent cell is valid, has path
                // and not visited yet, enqueue it.
                if (isValid(row, col) &&
                        mat[row][col] == 1 &&
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


}

class Point{
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class QueueNode{
    Point point;
    int dist;

    public QueueNode(Point point, int dist)
    {
        this.point = point;
        this.dist = dist;
    }
}


