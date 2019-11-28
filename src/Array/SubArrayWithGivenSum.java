package Array;

import java.util.Scanner;

/**
 * @author rrawani
 */
public class SubArrayWithGivenSum {
    public static void findIndex(int[] arr, int sum){
        int n = arr.length;
        int sumTillNow,j;
        for(int k=0; k<n; k++){
            sumTillNow=0;
            for( j=k; j<n; j++){
                sumTillNow+=arr[j];
                if(sumTillNow>sum){
                    break;
                }
                if(sumTillNow==sum){
                    System.out.println((++k) + " "+ (++j));
                    break;
                }
            }
            if(sumTillNow==sum)
                break;
        }
    }
    public static void main(String[] args) {
        int t,n, sum;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            n = sc.nextInt();
            int arr[] = new int[n];
            sum = sc.nextInt();
            for(int j=0; j<n; j++){
                arr[j]= sc.nextInt();
            }
            findIndex(arr, sum);
        }
    }
}
