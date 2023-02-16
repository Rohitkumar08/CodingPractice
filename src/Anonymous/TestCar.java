package Anonymous;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author rrawani
 */
public class TestCar {
    static{
        Date d1 = new Date();
    }
    /**
     * Would return the past date from the given date.
     *
     * @param numberOfDays
     * @return
     */
    public static Date getPastDate(int numberOfDays, Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -(numberOfDays));
        return calendar.getTime();
    }
    public static boolean isDateInCurrentWeek() {
        try {
            Date a = new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2018");

            Date b = new SimpleDateFormat("dd/MM/yyyy").parse("26/10/2018");
            /*Date c = new SimpleDateFormat("dd/MM/yyyy").parse();
            return a.compareTo(c) * c.compareTo(b) >= 0;*/
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean isBetweenDatesInclusiveStartExclusiveEnd(Date Date, Date Date1,
                                                                   Date Date2) {

        if(Date1.after(Date2)){
            System.out.println("not able to update");
        }else{
            System.out.println("update");
        }

        System.out.println(Date1.before(Date2));
        if(Date.compareTo(Date1) != 0){
            System.out.println("kjasbfkje "+Date.after(Date1));
        }

        return !Date.before(Date1) && !Date.after(Date2) && !Date.equals(Date2);
    }
    public static void main(String[] args) {
      Car chlao = new Audi();
      chlao.display();
      System.out.println(chlao.carName);

      double value = 4.5;
      Double d1 = value;
      Car car = new Car();
      String check = null;
      if(check.equals("abc")){
        System.out.println("tested");
      }
      System.out.println(car);
      System.out.println("car name is" + car.getName());
//      String.valueOf(null);
      Audi audi = new Audi();
      System.out.println(audi.getData());

      try {
          List<Integer> arr= new ArrayList<>();
          arr.add(2);
          arr.add(null);
          if(arr.get(1)==null){
            System.out.println("handled");
          }
         Map<String, List<Integer>> lst= new HashMap<>();
//          System.out.println(lst.get(0));
          System.out.println(lst.get("a"));
            String s ="abc";
            s.compareTo("kdn");
            Date date = new Date();
           Date newDate= getPastDate(6, date);
            System.out.println(newDate);
            Date maxDay = getPastDate(30, date);
            Date a = new SimpleDateFormat("yyyy-MM-dd").parse("2019-05-07");
          System.out.println(a.getTime());
            Date p = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-23");

            Date b = new SimpleDateFormat("dd/MM/yyyy").parse("03/11/2018");

            System.out.println(p.compareTo(a)<=0);
//            System.out.println(new Date().before(a));
            LocalDate d = a.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            System.out.println(false && false);
            if(LocalDate.now().isBefore(d)){
                System.out.println("FIRST BEFORE TODAY");
            }
            if(!d.isBefore(LocalDate.now())){
                System.out.println("BEFORE TODAY");
            }
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date c = formatter.parse(formatter.format(new Date()));

            LocalDate myDate = LocalDate.now();
            System.out.println(myDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY))+ "    "+d);
            System.out.println("*******Last Saturday is*****:  "+d.isBefore(myDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY))));


            if(isBetweenDatesInclusiveStartExclusiveEnd(c, a, b)){
                System.out.println("current week"+true );
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


      /*  if(!false){
            Audi.getInstance().audiMethod();
        }*/
        String s= "value of string";

        System.out.println(true && true);

        System.out.println(23/2.0);

        System.out.println(23%2.0);
        System.out.println("Hello" + 1 + 2 + 3 + 4);
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);



        int ₹ = 80000; //₹ represents Indian Rupee symbol
        String msg = (₹ >= 50000) ? "Good bonus" : "Average bonus";
        System.out.println(msg);

        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add("bca");
        lst.add("cab");
        lst.add("abd");
        lst = lst.stream().filter(str -> {
            if(str.equals("abc")){
                return false;
            }
            return true;
        }).collect(Collectors.toList());
        System.out.println(lst.size()+ " "+lst);

    }
}
