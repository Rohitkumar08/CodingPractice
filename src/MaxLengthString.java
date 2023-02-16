import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created 23/12/21 9:08 PM
 *
 * @author Rohit Rawani
 */
public class MaxLengthString {
    public static void main(String[] args) {
        System.out.println(getMaxLength("abcdabcde"));
        int[] arr = {-2, 0, 8};
        System.out.println(getMAxSum(arr));
    }


    public static int getMAxSum(int[] arr){
        int maxTillNow = Integer.MIN_VALUE;
        int currMax=0;
        for(int i=0; i<arr.length; i++){
            currMax+=arr[i];
            if(currMax>maxTillNow){
                maxTillNow= currMax;
            }
            if(currMax<0){
                currMax=0;
            }
        }
        return maxTillNow;
    }


    public static int getMaxLength(String str){
        ArrayList<Character> charList = new ArrayList<>();
        int maxLengthTillNow =0;
        for(int i=0; i<str.length(); i++){
            int currentLength=1;
            charList.add(str.charAt(i));
            for(int j=i+1; j<str.length(); j++) {
                //check if the char is already there in the list
                if (!charList.contains(str.charAt(j))) {
                    charList.add(str.charAt(i));
                    currentLength+=1;
                    if(maxLengthTillNow<currentLength){
                        maxLengthTillNow= currentLength;
                    }
                } else {
                    charList.clear();
                    break;
                }
            }
        }
        return maxLengthTillNow;
    }

//    public static int getOptimisedMaxLength(String str){
//        ArrayList<Character> charList = new ArrayList<>();
//        int maxLengthTillNow =0;
//        int currentLength=1;
//        charList.add(0);
//        for(int i=0; i<str.length(); i++){
//                //check if the char is already there in the list
//                if (!charList.contains(str.charAt(j))) {
//                    charList.add(str.charAt(i));
//                    currentLength+=1;
//                    if(maxLengthTillNow<currentLength){
//                        maxLengthTillNow= currentLength;
//                    }
//                } else {
//                    int lastIndex = charList.lastIndexOf(str.charAt(i));
//
//                    charList.add(str.charAt(i));
//                }
//        }
//        return charList.size();
//    }
}
