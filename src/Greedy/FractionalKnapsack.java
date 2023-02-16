package Greedy;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class FractionalKnapsack {

    public static int getMaxValue(int[] val, int[] weight, int w){

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(fetchListOFPairs());
    }

    public static List<Pair<Integer, String>> fetchListOFPairs(){
        List<Pair<Integer, String>> result = new ArrayList<>();
        int i=10;
        while(i>0){
            Pair<Integer, String> pair = new Pair<>(i, "value");
            result.add(pair);
            i--;
        }
        return result;
    }
 }
