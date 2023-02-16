//package Anonymous;
//
//public class Test2 {
//
//    import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//
//    class Test2 {
//
//        /*
//         * Complete the 'getMaxBarrier' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts following parameters:
//         *  1. INTEGER_ARRAY initialEnergy
//         *  2. LONG_INTEGER th
//         */
//
//        public static int getMaxBarrier(List<Integer> initialEnergy, long th) {
//            // Write your code here
//            Collections.sort(initialEnergy);
//            System.out.println(initialEnergy);
//            System.out.println(th);
//            int n = initialEnergy.size();
//            long lowestSum =Long.MAX_VALUE;
//            int barrier=0;
//            int low=0;
//            int high =initialEnergy.get(n-1);
//            while(high-low>1){
//                int mid = (high+low)/2;
//                if(searchBarrrier(initialEnergy, th, mid)> th){
//                    low = mid+1;
//                }else{
//                    high = mid;
//                }
//            }
//
//            for(int i= 0; i< initialEnergy.get(n-1); i++ ){
//                long currSum=0;
//                for(int j=0; j<n; j++){
//                    long diff = initialEnergy.get(j)-i;
//                    if(diff >0){
//                        currSum+=diff;
//                    }
//                }
//                if(currSum>th){
//                    barrier =i;
//                }
//                if(currSum<th){
//                    return i-1;
//                }
//                if(currSum == th){
//                    return i;
//                }
//            }
//            return barrier;
//        }
//
//        public static long searchBarrrier(List<Integer> initialEnergy, long th, int barrier){
//            long lowestSum =Long.MAX_VALUE;
//            int n = initialEnergy.size();
//
//            long currSum=0;
//            for(int j=0; j<n; j++){
//                long diff = initialEnergy.get(j)-barrier;
//                if(diff >0){
//                    currSum+=diff;
//                }
//            }
//            return currSum;
//        }
//
//    }
//
//    }
//
//}
