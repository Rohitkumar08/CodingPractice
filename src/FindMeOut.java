import java.util.HashMap;
import java.util.Map;

/**
 * Created 05/01/22 4:41 PM
 *
 * @author Rohit Rawani
 */
public class FindMeOut {
    public static void main(String[] args) {
        System.out.println(fetchMinNumber(11));
        System.out.println(getSumOfLetters("MORE"));
    }
    public static int fetchMinNumber(int n){
        for(int i=2; i<=10; i++){
            int res = n*i;
            int temp=res;
            int currSum=0;
            while(temp!=0){
                currSum+=temp%10;
                temp=temp/10;
            }
            if(currSum==n){
                return res;
            }
        }
        return -1;
    }

    public static int getSumOfLetters(String s){
        int first=0; int second=1;  int max=91;
        Map<Integer, Integer> charMap = new HashMap<>();
        charMap.put(65, 0);
        charMap.put(66, 1);
        for(int i=67; i<=max; i++){
            int third = first+second;
            first=second;
            second=third;
            charMap.put(i, third);
        }
        char[] arr = s.toCharArray();
        int sum=0;
        for(char c: arr){
            sum+=charMap.get((int)c);
        }
        return sum;
    }
}
