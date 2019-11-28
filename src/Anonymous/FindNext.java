package Anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author rrawani
 */
public class FindNext {
    public static int findNext(int[] arr, int x){
        Arrays.sort(arr);
        int n = arr.length;
        if(x >= arr[n-1]){
            return x+1;
        }
            int nextElementIndex =0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == arr[i+1]){
                    continue;
                }
                if( x <arr[i]){
                    nextElementIndex = i;
                    break;
                }
                if(x == arr[i]){
                    if(i != arr.length-1){
                        nextElementIndex = i+1;
                        break;
                    }
                    else{
                        return x+1;
                    }
                }
            }
            for(int i=x; i<arr[nextElementIndex]; i++){
                int p = i+1;
                if(IntStream.of(arr).anyMatch(q -> q == p)){
                    continue;
                }else{
                    x+=1;
                    break;
                }
            }
            return x;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        for(int p=0; p<n; p++){
            arr[p]= sc.nextInt();
        }
        for(int i =0; i<q; i++){
            int x = sc.nextInt();
            int output = findNext(arr, x );
            System.out.println(output);
        }
        try{
            System.exit(0);
            int a =2/0;

        }catch (ArithmeticException e){
            System.out.println("handled");
        }finally{
            System.out.println("a");
            System.exit(0);
            System.out.println("b");
            System.out.println("c");
            System.out.println("d");
        }

    }
}
