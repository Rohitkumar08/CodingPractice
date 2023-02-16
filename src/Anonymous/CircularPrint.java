package Anonymous;

/**
 * Created 18/12/21 5:03 PM
 *
 * @author Rohit Rawani
 */
public class CircularPrint {

    public static long getTime(String s) {
        // Write your code here
        char[] arr =s.toCharArray();
        long sum=getDiff('A', arr[0]);
        for(int i=0; i<arr.length-1; i++){
            sum+=getDiff(arr[i], arr[i+1]);
        }
        return sum;
    }

    public static long getDiff(char a, char b){
        if(Math.abs(a-b)>13){
            if((a=='Z' && b=='A') || (a=='A' && b=='Z')){
                return 1;
            }
            return Math.abs(Math.min((getDiff(a, 'A')+ getDiff(b, 'A')), a-b));
        }else{
            return Math.abs(a-b);
        }
    }

    public static void main(String[] args) {
        System.out.println(getTime("AZGB"));
    }
}
