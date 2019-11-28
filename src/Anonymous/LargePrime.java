package Anonymous;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author rrawani
 */
public class LargePrime {
    public static boolean checkPrime(BigInteger n){

        return (n.isProbablePrime(1)? true: false);
        /*BigInteger index;
        int count=0;
        if(n.compareTo(new BigInteger("1"))<=0 || (n.mod(new BigInteger("2")).equals(BigInteger.ZERO))){
            return false;
        }
        if(n.compareTo(new BigInteger("2"))==0){
            return true;
        }
        for (index = new BigInteger("3"); index.multiply(index).compareTo(n)<1; index=index.add(new BigInteger("2"))){
            if(n.mod(index).equals(BigInteger.ZERO)){
                count++;
            }
        }
        return (count>0? false: true);*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        BigInteger i = new BigInteger("21");
        if(checkPrime(i)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
