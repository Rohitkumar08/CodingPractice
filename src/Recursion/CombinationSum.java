package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created 18/11/21 12:30 AM
 *
 * @author Rohit Rawani
 */
public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum cs= new CombinationSum();
        int[] arr = {10,1,2,7,6,1,5};
        System.out.println(cs.combinationSum(arr, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(0, target, new ArrayList<>(), candidates, result);
        return result;

    }


    public void combinationSum(int index, int target, List<Integer> stk, int[] arr, List<List<Integer>> result) {
        if(index==arr.length-1 && target==0){
            result.add(new ArrayList<>(stk));
            return;
        }
        if(index>=arr.length){
            return;
        }
        if(arr[index] <= target){
            stk.add(arr[index]);
            combinationSum(index, target-arr[index], stk, arr, result);
//             for non repeated ones
//            combinationSum(index+1, target-arr[index], stk, arr, result);
            stk.remove(stk.size()-1);
        }
        combinationSum(index+1, target, stk, arr, result);
    }

}
