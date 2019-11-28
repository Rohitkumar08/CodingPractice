package Anonymous;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author Rohit
 */
public class strOcc{
    public static String countOcc(String str){
        throw new RuntimeException();
       /* HashMap<Character, Integer> hmap = new HashMap<>();
        char[] arr = str.toCharArray();
        for(char c: arr){
            if(hmap.containsKey(c)){
                int count = hmap.get(c);
                hmap.put(c, count+1);
            }
            else{
                hmap.put(c, 1);
            }
        }
        String res= "";

        for(char ch : arr){
            if(res.contains(Character.toString(ch))){
                continue;
            }
            res = res+ch+hmap.get(ch);
        }

        return res;*/
    }
    public static void main(String[] args) {
        System.out.println(1+2+3+ " ");
        try{
            String s = countOcc("qjhfvefq");
            System.out.println("C");
        }catch(RuntimeException ex){
            System.out.println("A");
        }catch(Exception exec){
            System.out.println("B");
        }finally {
            System.out.println("D");
        }
        String s = "occurrences";
        String str = countOcc(s);
        System.out.println(str);
    }
}
