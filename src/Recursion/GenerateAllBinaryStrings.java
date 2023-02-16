package Recursion;

import java.util.HashSet;
import java.util.Set;

public class GenerateAllBinaryStrings {
    static Set<String> result = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(generateAllBinaryString("1??0?101", 0));
    }

    public static Set<String> generateAllBinaryString(String pattern, int index){
        //base case
        if(index==pattern.length()){
            result.add(pattern);
            return result;
        }

        for(int i=0; i<=1; i++){
            if(pattern.charAt(index)=='?'){
                generateAllBinaryString(pattern.substring(0, index) + i + pattern.substring(index+1), index+1);
            }else{
                generateAllBinaryString(pattern, index+1);
            }
        }
        return result;
    }
}
