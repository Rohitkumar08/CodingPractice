package Anonymous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MInRoundsToCompleteTasks {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("MMM");
        Date date1 = format1.parse("29-Dec-2022");
        String formattedExpiry = format2.format(date1).toUpperCase();
        System.out.println(formattedExpiry);

        int[] arr = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(arr));
    }

    public static int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count=1;
        for(int i=0; i<tasks.length; i++){
            if(tasks[i]!=tasks[i+1]){
                if(count%3==0 || count%2==0){
                    count=0;
                }else{
                    return -1;
                }
            }
            count++;
        }
        return -1;
    }



}
