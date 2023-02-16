package Recursion;

import java.util.ArrayList;
import java.util.List;

public class WorkSchedule {

    static List<String> timeTable = new ArrayList<>();

    private static List<String> createTable(String[] listPattern, int index, int variation, int dayHour) {
        if(index==listPattern.length){
            if(variation==0){
                timeTable.add(String.join("", listPattern));
            }
            return timeTable;
        }
        if(listPattern[index].equals(String.valueOf("?"))){
            for(int i=0; i<=dayHour; i++){
                listPattern[index] = String.valueOf(i);
                createTable(listPattern, index+1, variation-i, dayHour);
                //backtrack to create the original string
                listPattern[index] = "?";
            }
        }
        else{
            createTable(listPattern, index+1, variation, dayHour);
        }
        return timeTable;

    }

    private static List<String> construct(int workHour, int dayHour, String pattern) {
        int workedHr = 0;
        int variation =0;
        String[] listPattern = pattern.split("");
        for(String s: listPattern){
            if(!String.valueOf('?').equals(s)){
                workedHr+=Integer.valueOf(s);
            }
        }
        variation = workHour-workedHr;

        createTable(listPattern, 0, variation, dayHour);
        return timeTable;
    }

    public static List<String> findSchedule(int workHour, int dayHour, String pattern){
        return construct(workHour, dayHour, pattern);
    }

    public static void main(String[] args) {
        System.out.println(findSchedule(24, 4, "08??84?"));
    }



}
