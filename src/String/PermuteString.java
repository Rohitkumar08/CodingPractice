package String;

import java.util.Scanner;

public class PermuteString {

    public static void main(String[] args) {
      Boolean x=call();
      System.out.println(x);
        permute("abc".split(""),0);
    }
    static void permute(String str[], int index){
        if(str.length==index){
            System.out.println(String.join("",str));
            return;
        }else{
            for(int i=index; i<str.length; i++){
                swap(str, index,i);
                permute(str,index+1);
                swap(str, i, index);
            }
        }
    }
    static boolean call(){
      return true;
    }

    static void swap(String arr[], int i, int j){
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
