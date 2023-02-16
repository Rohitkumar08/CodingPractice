package Recursion;

import java.util.List;

/**
 * Created 18/11/21 11:57 PM
 *
 * @author Rohit Rawani
 */
public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        getSubsetSum(arr, 0, 10, "", 0);
    }

    public static void  getSubsetSum(int[] arr, int index, int target, String set, int currSum){
        if(currSum==target){
            System.out.println(set);
            return;
        }
        if(index >= arr.length){
            return;
        }
        getSubsetSum(arr, index+1, target, set+ arr[index] + ", ", currSum+arr[index]);
        getSubsetSum(arr, index+1, target, set, currSum);
    }
}
