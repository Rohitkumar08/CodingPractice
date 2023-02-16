package Anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {10, 5, 5, 6, 2, 8};

        System.out.println(findTriplets(arr));
        int c = 2;
        int n=13;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            }
            else
                c++;
        }


    }

    public static List<List<Integer>> findTriplets(int[] arr)
    {
        //Write your code here.
        Arrays.sort(arr);
        List<List<Integer>> finalResult = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){

            int start=0;
            int end = i-1;
            while(start<end){
                if(arr[start]+ arr[end]== arr[i]){
                    ArrayList<Integer> result =new ArrayList<>();
                    result.add(arr[i]);
                    result.add(arr[start]);
                    result.add(arr[end]);
                    finalResult.add(result.stream().sorted().collect(Collectors.toList()));
                    start++;
                    end--;
                }
                if(arr[start]+ arr[end]> arr[i]){
                    end--;
                }
                if(arr[start]+ arr[end]< arr[i]){
                    start++;
                }
            }
        }
        return finalResult;

    }
}
