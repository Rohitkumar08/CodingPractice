package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author rrawani
 */
public class StringDeletion {
    public static String deleteString(int n, String s){
        HashMap<Character, Integer> map= getCount(s);
       /* if()
        Set<Character> keys=map.keySet();
        int minValue = Integer.MAX_VALUE;
        char minCh;

        for(Character c : keys) {
            int value = map.get(c);
            if(value < minValue) {
                minValue = value;
                minCh = c;
            }
        }
        for(Character c: keys){
            map.put(c, map.get(c)-minValue);
        }*/
        StringBuilder str = new StringBuilder();
        for(Character c: map.keySet()){
            for(int i=0; i<map.get(c);i++)
            str.append(c);
        }
        return str.toString();
    }

    public static HashMap<Character, Integer> getCount(String s){
        HashMap<Character, Integer> hmap = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);
            }else{
                hmap.put(c, 1);
            }
        }
        return hmap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= sc.next();
        deleteString(n, s);
    }
}
