import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        int[] arr = {7, 13, 24, 2, 99, 71, 4, 7, 55, 193, 5};
        System.out.println(getSecondMin(arr));
        System.out.println(getFrequency("axadxddacaxxacds"));
    }

    public static int getSecondMin(int[] arr){
        int minValue =Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<minValue){
                secMin=minValue;
                minValue=arr[i];
            }else if(arr[i] < secMin){
                secMin = arr[i];
            }
        }
        return secMin;
    }

    public static Map<Character, Integer> getFrequency(String str){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!frequencyMap.containsKey(str.charAt(i))){
                frequencyMap.put(c, 1);
            }else{
                frequencyMap.put(c, frequencyMap.get(c)+1);
            }
        }
        return frequencyMap;
    }
}
