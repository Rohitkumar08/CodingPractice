
package DP;

/**
 * Created 6/15/2019 11:49 PM
 *
 * @author Rohit Rawani
 */
public class MaxSumWithoutAdjacent {
  public static int maxSumExcludingAdjacent(int[] arr, int n){
    if(n<0){
      return 0;
    }
    if(n==0){
      return arr[0];
    }

    int include = maxSumExcludingAdjacent(arr, n-2) + arr[n];
    int exclude = maxSumExcludingAdjacent(arr, n-1) + 0;

    return Math.max(include, exclude);
  }

  public static int rob(int[] nums) {
    int excludingFirst = calculateSum(nums, 1, nums.length);
    int excludingLast = calculateSum(nums, 0, nums.length-1);
    return Math.max(excludingFirst, excludingLast );
  }

  public static int calculateSum(int[] nums, int s, int e){

    int cMax=0, pMax=0, ppMax=0;
    for(int i=s; i<e; i++){
      cMax= Math.max(pMax, nums[i]+ppMax);
      ppMax=pMax;
      pMax=cMax;

    }
    return cMax;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 1};
    int res = rob(arr);
    System.out.println(res);

    System.out.println(maxSumExcludingAdjacent(arr, arr.length - 1));
  }
}
