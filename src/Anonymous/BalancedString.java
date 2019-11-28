package Anonymous;

import java.util.Scanner;

/**
 * @author rrawani
 */
public class BalancedString {
    public static int findOcc(String s){
        char arr[] =  s.toCharArray();
        int countSmallBOpen=0;
        int countSmallBClose=0;
        int countCurlyBopen=0;
        int countCurlyBclose=0;
        int countSquareBopen=0;
        int countSquareBclose=0;
        for(char c : arr){
            if(c =='('){
                countSmallBOpen++;
            }
            if(c == ')'){
                countSmallBClose++;
            }
            if(c == '{'){
                countCurlyBopen++;
            }
            if(c == '}'){
                countCurlyBclose++;
            }
            if(c == '['){
                countSquareBopen++;
            }
            if(c == ']'){
                countSquareBclose++;
            }
        }
        int total=0;
        int small=0;
        if(countSmallBOpen != countSmallBClose){
            small = Math.min(countSmallBOpen, countSmallBClose);
            total = total+ small +small;
        }
        else{
            total = total + countSmallBOpen+countSmallBClose;
        }
        if(countCurlyBopen!= countCurlyBclose){
            small = Math.min(countCurlyBopen, countCurlyBclose);
            total = total+ small +small;
        }
        else{
            total = total+ countCurlyBopen+ countCurlyBclose;
        }
        if(countSquareBopen!= countSquareBclose){
            small = Math.min(countSquareBopen, countSquareBclose);
            total = total+small +small;
        }
        else{
            total+= countSquareBopen+ countSquareBclose;
        }


        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s = sc.next();
            int output = findOcc(s.trim());
            System.out.println(output);
        }
    }
}
