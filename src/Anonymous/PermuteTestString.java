package Anonymous;

import java.util.Arrays;

/**
 * abc, acb, bac, bca, cab, cba
 */
public class PermuteTestString {
    static boolean result = false;

    public static void main(String[] args) {
        System.out.println(permuteString("dinitrophenylhydrazine", "acetylphenylhydrazine"));
    }

    public static boolean permuteString(String s1, String s2){
//        generatePermute(s1.split(""), 0, s2);
        return  usingSort(s1, s2);
    }

    private static boolean usingSort(String s1,  String s2) {
        s1 = sort(s1);
        //for each substring of s2 after sorting
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(sort(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }

    public static String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
    /**
     * brute force by generating all substrings
     * @param s1
     * @param index
     * @param s2
     */
    private static void generatePermute(String[] s1, int index, String s2) {
        if(index==s1.length){
            if(s2.contains(String.join( "", s1))){
                result = true;
                return ;
            }
        }

        for(int i=index; i<s1.length; i++){
            swap(s1, index, i);
            generatePermute(s1, index+1, s2);
            swap(s1, i, index);
        }
    }

    private static void swap(String[] s1, int i, int j){
        String temp = s1[i];
        s1[i] = s1[j];
        s1[j] = temp;
    }
}
