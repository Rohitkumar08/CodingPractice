package Anonymous;

import java.util.Scanner;

public class matrix {

    public static void  maxSumMatrix(int n){

        int sum=0;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){

                sum+=i/j;
          }

        }
        System.out.println(sum);
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       int t = Integer.parseInt(s);
        for(int i=0; i<t ; i++){
            int n = sc.nextInt();
            maxSumMatrix(n);
        }
    }
}
