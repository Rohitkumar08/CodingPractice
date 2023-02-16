
package DP;

import java.util.Scanner;

/**
 * Created 6/5/2019 9:52 PM
 *
 * @author Rohit Rawani
 */
public class ClimbingStairs {

  static int memo[] = new int[1000];
    public static int climbStairs(int n) {
      // base case
      if (n < 0)
        return 0;
      if (n == 0)
        return 1;
      if(memo[n]!= 0){
        return memo[n];
      }
      return memo[n]= climbStairs(n-1)+climbStairs(n-2);
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = climbStairs(n);
    System.out.println(result);
  }

}
