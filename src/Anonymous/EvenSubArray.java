package Anonymous;

import java.util.ArrayList;
import java.util.List;

public class EvenSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(evenSubArray(arr, 2));
        subArray(arr);
    }

    public static void subArray(int[] arr){
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<=arr.length; j++){
                List<Integer> list = new ArrayList<>();
                int k =i;
                while(k<j){
                    list.add(arr[k]);
                    k++;
                }
                finalList.add(list);
            }

        }
        System.out.println(finalList);
    }

    public static int evenSubArray(int[] arr, int k) {
        int current = 0;
        int first = 0;
        int currentOddCount = 0;
        int counter = 0;
        int n = arr.length;
        while (first < n) {
            if (current == n) {
                first++;
                current = first;
                currentOddCount = 0;
                continue;
            }
            if (arr[current] % 2 != 0) {
                currentOddCount++;
            }
            if (currentOddCount > k) {
                first++;
                current = first;
                currentOddCount = 0;
                continue;
            }
            current++;
            counter++;
        }
        return counter;
    }
}
