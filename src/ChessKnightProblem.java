import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ChessKnightProblem {
    public static void main(String[] args) {
        int knightsPos[] = {99, 99};
        int target[] = {0, 0};
        System.out.println(getMinimumNoOfMoves(knightsPos, target, 100));
    }

    public static int getMinimumNoOfMoves(int knightPos[], int target[], int N){
        int xPos[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int yPos[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(knightPos[0], knightPos[1], 0));

        Position position;
        int x,y;
        boolean visited[][] = new boolean[N+1][N+1];
        visited[knightPos[0]][knightPos[1]] = true;

        while(!queue.isEmpty()){
            position = queue.poll();
            if(position.i == target[0] && position.j == target[1]){
                return position.mov;
            }
            for(int p=0; p<8; p++){
                x = position.i + xPos[p];
                y = position.j + yPos[p];
                if(isSafe(x, y, N) && !visited[x][y]){
                    visited[x][y] = true;
                    queue.add(new Position(x, y, position.mov+1));
                }
            }
        }
        return -1;
    }

    public static boolean isSafe(int i, int j, int N){
        if(i>=0 && j>=0 && i<=N && j<=N){
            return true;
        }
        return false;
    }

}

class Position{
    int i,j;
    int mov;

    public Position(int i, int j, int mov){
        this.i = i;
        this.j = j;
        this.mov = mov;
    }
}
