package Anonymous;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created 8/9/2019 10:57 PM
 *
 * @author Rohit Rawani
 */
public class Mother {

  public static int[] getData(int[] arr, int n) {
    int[] result = new int[n];
    int nli[][]= new int[n][n];
    if (n == 1) {
      return new int[]{1};
    }
    for(int i=0; i<n; i++){
      nli[i][0]=arr[i];
      nli[i][1]=i;
    }

    Arrays.sort(nli, new java.util.Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
      }
    });
//    System.out.println(nli[0][0]+" "+nli[0][1]);
    for(int i=0; i<n; i++){
        if(0 < nli[i][1] && nli[i][1] < n-1){
          if (arr[nli[i][1]-1] < arr[nli[i][1]] && arr[nli[i][1]+1] < arr[nli[i][1]])
          result[nli[i][1]] = Math.max(result[nli[i][1]-1],result[nli[i][1]+1])+1;
          else if(arr[nli[i][1]-1] < arr[nli[i][1]])
          result[nli[i][1]] = result[nli[i][1]-1]+1;
          else if(arr[nli[i][1]+1] < arr[nli[i][1]])
          result[nli[i][1]] = result[nli[i][1]+1]+1;
          else
          result[nli[i][1]] = 1;
        }
      else if(nli[i][1] == 0){
          if (arr[nli[i][1]+1] < arr[nli[i][1]])
          result[nli[i][1]] = result[nli[i][1]+1]+1;
          else
          result[nli[i][1]] = 1;
        }
      else{
          if(arr[nli[i][1]-1] < arr[nli[i][1]]){
            result[nli[i][1]] = result[nli[i][1]-1]+1;
          }
          else
          result[nli[i][1]] = 1;
      }

    }


    /*for (int i = 0; i < n; i++) {
      int j = 0;
      if (i != n - 1 && arr[i] > arr[i + 1]) {
        while (j + i < n - 1 && arr[i + j] > arr[i + j + 1]) {
          j++;
        }
        result[i] = j + 1;
        if (i > 0 && result[i] == result[i - 1] && arr[i] > arr[i - 1]) {
          result[i] = result[i - 1] + 1;
        }
      } else if (i > 0 && arr[i] < arr[i - 1]) {
        continue;
      } else if (i > 0 && arr[i] > arr[i - 1]) {
        result[i] = result[i - 1] + 1;
      }
    }*/
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int j = 0; j < n; j++) {
        arr[j] = sc.nextInt();
      }
      int result[] = getData(arr, arr.length);
      IntStream.of(result).forEach(ele -> System.out.print(ele + " "));
    }
  }

}
