package Array;


//this won't gonna work famous question in stock buy and sell
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

public class StockBuySell {


    public static void generateProfit(int arr[], int n){

        int frstMin=arr[0];
        int frstMaxIndex=0;
        int secMaxIndex=0;
        int frstMax=0;
        int secMin=0;
        int secMax=0;
        for(int k=0; k<n-1; k++){
            if(arr[k]<frstMin)
                frstMin=arr[k];
        }
        int frstMinIndex=indexOf(arr, frstMin);

        //2nd min
        secMin=arr[0];
        for(int k=0; k<n-1; k++){
            if((arr[k]<secMin) && (arr[k]>frstMin))
                secMin=arr[k];
        }
        int secMinIndex = indexOf(arr, secMin);


            try{
                frstMax= arr[frstMinIndex+1];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("nothing");
            }
            if(frstMinIndex>secMinIndex){
                for(int k= frstMinIndex+2; k<n; k++){
                    if(arr[k]>frstMax)
                        frstMax=arr[k];
                }
            }
            else{
                for(int k= frstMinIndex+2; k<secMinIndex; k++){
                    if(arr[k]>frstMax)
                        frstMax=arr[k];
                }
            }
             frstMaxIndex = indexOf(arr, frstMax);

            //2nd Max
            try{
                secMax= arr[secMinIndex+1];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("nothing");
            }
            if(frstMinIndex>secMinIndex){
                for(int k= secMinIndex+2; k<frstMinIndex; k++){
                    if(arr[k]>secMax)
                        secMax=arr[k];
                }
            }
            else{
                for(int k= secMinIndex+2; k<n; k++){
                    if(arr[k]>secMax)
                        secMax=arr[k];
                }

        }

        secMaxIndex = indexOf(arr, secMax);

        if(frstMinIndex>secMinIndex)
        System.out.println("("+secMinIndex+" "+secMaxIndex+")"+"  "+"("+frstMinIndex+" "+frstMaxIndex+")");
        else
            System.out.println("("+frstMinIndex+" "+frstMaxIndex+")"+"  "+"("+secMinIndex+" "+secMaxIndex+")");

   }
    public static int indexOf(int arr[], int q){
        for(int z=0; z<arr.length;z++){
            if(arr[z]==q)
                return z;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger in= new BigInteger("100");
        StringBuilder s=new StringBuilder("abdqjkbckqj\n\n");
        s.append("kjbcfeuwihbfdkejq");
      System.out.println(s);

        int t=sc.nextInt();
        for(int p=0; p<t; p++)
        {
           int n = sc.nextInt();
            int[] arr= new int[n];
           for(int i=0; i<n; i++)
               arr[i]=sc.nextInt();
            generateProfit(arr, n);
        }
    }
}
