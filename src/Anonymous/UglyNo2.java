package Anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class UglyNo2 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber2(6));
    }

    public static int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        List<Integer> ug = new ArrayList<>();
        ug.add(1);
        int max = Integer.MAX_VALUE;
        for(int i=2; i<=max; i++){
            //get all factors of i in a list
            if(ug.size()==n){
                break;
            }
            int c = 2;
            int j=i;
            while (j > 1) {
                if (j % c == 0) {
//                    System.out.print(c + " ");
                    if(c>5){
                        break;
                    }
                    j /= c;
                }
                else
                    c++;
            }
            if(j==1){
                ug.add(i);
            }
        }
//        System.out.println(ug);
        return ug.get(n-1);
    }

    public static int nthUglyNumber2(int n) {
        TreeSet<Long> ans = new TreeSet<>();
        ans.add(1L);
        for (int i = 0; i < n - 1; ++i) {
            long first = ans.pollFirst();
            ans.add(first * 2);
            ans.add(first * 3);
            ans.add(first * 5);
        }
        return ans.first().intValue();
    }

}
