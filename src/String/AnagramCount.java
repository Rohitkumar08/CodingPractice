package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Rohit
 */
public class AnagramCount {


    public static int countNoOfDeletion(String a, String b){
       HashMap<Character, Integer> hmap1 = new HashMap<>();
        putData(a, hmap1);

        HashMap<Character, Integer> hmap2 = new HashMap<>();
        putData(b, hmap2);
        return 0;
    }

    public static void putData(String s, HashMap hmap) throws RuntimeException{
        char[] arr1 = s.toCharArray();
        for(char c : arr1){
            if(hmap.containsKey(c)){
                int count = (int) hmap.get(c);
                hmap.put(c, count+1);
            }
            else{
                hmap.put(c, 1);
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++)
        {
            String a = br.readLine();
            String b = br.readLine();
            int noOfDel = countNoOfDeletion(a,b);
        }
    }


}
