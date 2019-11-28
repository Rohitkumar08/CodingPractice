package Array;

import java.util.Scanner;

public class SegregateOneZeros {

    public static void segregate(int arr[]){
      throw new NullPointerException();
       /* int low=0; int high = arr.length-1;int temp=0;
        while(low<=high) {

           while (arr[low] == 0) {
                low++;
            }
            while (arr[high] == 1) {
                high--;
            }
            if (low < high) {
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }

        }*/
    }


    public static void main(String[] args) {
    int arr[] = {0, 1, 0, 0 ,1 ,1, 0};
    segregate(arr);
    for(int i=0; i<arr.length-1; i++)
        System.out.print(arr[i]+" ");
    }
}
