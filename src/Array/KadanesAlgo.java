package Array;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int result = findMaxSum(arr, n);
        System.out.println(result);

    }
    public static int findMaxSum(int arr[], int n){
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere =0;

        for(int j=0; j<n; j++){
            if(maxEndingHere > maxSoFar)
                maxSoFar=maxEndingHere;
            maxEndingHere= maxEndingHere + arr[j];
            if(maxEndingHere<0)
                maxEndingHere=0;
        }
        return maxSoFar;
    }
}
