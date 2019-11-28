package Array;

import java.util.Base64;
import java.util.HashSet;
import java.util.TreeSet;

/*this class seggregates the elements in an array with
only digits containing 1, 2 or 3 in ascending order*/

public class GeeksGold {
    public static void seggregateArray(int arr[]){
        TreeSet<Integer> treeSet = new TreeSet<>();
         for(int i=0; i<arr.length; i++){
            Boolean check = checkDigits(arr[i]);
            if(check){
                treeSet.add(arr[i]);
            }
        }
        System.out.println(treeSet);
    }
    public static boolean checkDigits(int element){
        HashSet<Integer> hset = new HashSet<>();
        int temp= element;
        int digit;
        while(temp!=0 && hset.size()!=3){
            digit = temp%10;
            if(digit == 1 || digit == 2 || digit == 3){
                hset.add(digit);
            }
            temp=temp/10;
        }
        if(hset.size()==3)
        return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Base64 base64;
        int arr[] = {1453621, 123, 12342, 456, 64351, 46281};
        seggregateArray(arr);
    }
}
