package Array;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

public class TrappingRainWater {
    public static int findTrapUnits(int arr[], int n){
        int maxTillNow= arr[0];
        int indexOFMaxTillNow =0;
        int count=0;
        int maxCount=0;
        int finalCount=0;
        int temp=0;
        for(int k=1; k<n; k++){

                if(arr[k]>=maxTillNow)
                {
                    temp=0;
                    count=0;
                    int i=k-1;
                    while(i>indexOFMaxTillNow){
                        count =count+ (maxTillNow-arr[i]);
                        i--;
                    }
                    maxTillNow=arr[k];
                    indexOFMaxTillNow = k;
                    maxCount+=count;
                }
                if(arr[k] <maxTillNow && arr[k]>arr[k-1]){
                    count=0;
                    int j =k-1;
                    while(arr[k]>arr[j]){
                        count = count + (arr[k]-arr[j]);
                        j--;
                    }
                    temp+=count;

                }
                finalCount=maxCount+temp;
           }

        return finalCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++){

            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j =0; j<n ;j++)
                arr[j] = sc.nextInt();

            int result=findTrapUnits(arr,n);
            System.out.println(result);
        }
    }
}
