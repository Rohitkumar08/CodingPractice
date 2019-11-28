package String;

import java.util.Random;

public class ImutableStrings {
    static final  int A = 15342; // any number in (0, RAND_MAX)
    static final  int C = 45194; // any number in [0, RAND_MAX)
    static final int  RAND_MAX = 100000;
    static long prev = 0;
    public static long getData(int n){
        try{
//            Random rand = new Random();
             //seed. any number in [0, RAND_MAX)
            prev = ( prev ^ A + C ) % RAND_MAX;
            return prev;
        }catch(Exception e){
                return 1;
        }
    }
    public static void main(String[] args) {

        System.out.println(getData(2));
        String s2 = new String("abc");
        String s1 = "abc";
        String s8 = s2.intern();
        System.out.println(s1==s8);

        String s3= s2;
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+"  "+s2.hashCode());

        String s4 = new String("abc").intern();
        System.out.println((s1==s4)+" "+s4.hashCode());
    }
}
