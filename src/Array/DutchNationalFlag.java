package Array;

import java.util.Scanner;

/*1. take a mid, low and high while mid<=high
2. then compare the arr[mid]  with switch statements
3. if the arr[mid] is 0 then move it forward -by swaping with the low element and increase the low and mid.
4. if the arr[mid] is 1 then simply increase the mid no swaping.
5. and if the arr[mid] is 2 then move it to the last- by swaping with the last(high) element and decrease the high.*/

public class DutchNationalFlag {

    public static void sortTheArray(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
            case 0: {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
            }
            case 1: {
                mid++;
                break;
            }
            case 2: {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                break;
            }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortTheArray(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
