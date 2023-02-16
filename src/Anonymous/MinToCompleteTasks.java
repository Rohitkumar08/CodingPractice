package Anonymous;

public class MinToCompleteTasks {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("\n" + countWays(n));

    }

    static int countWays(int n)
    {
        int DP[] = new int[n + 1];

        // base cases
        DP[0] = DP[1] = -1;
        DP[2] = 1;
        DP[3] = 1;
        DP[4] = -1;
        DP[5] = 1;

        // iterate for all values from 4 to n
        for (int i = 6; i <= n; i++)
            DP[i] = DP[i - 2] + DP[i - 3];
        for( int i=0; i<DP.length; i++)
        System.out.print(DP[i]);
        return DP[n];
    }
}
