package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 13/11/21 11:47 PM
 *
 * @author Rohit Rawani
 */
public class Subsequences {

    public static ArrayList<String> getSubse(String str){
        if(str.length()==0){
            ArrayList<String> lst = new ArrayList<>();
            lst.add("");
            return lst;
        }
        char c = str.charAt(0);
        ArrayList<String> restStr = getSubse(str.substring(1));
        ArrayList<String> resultStr = new ArrayList<>();
        //getSubs(abc) = getSubse(bc) + a getSubse(bc)
        for(String s : restStr){
            resultStr.add("" + s);
        }
        for(String s : restStr){
            resultStr.add(c + s);
        }
        return resultStr;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList< String> res = getSubse(str);
        System.out.println(res);
    }
}
