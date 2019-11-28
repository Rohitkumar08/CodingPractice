package Array;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

class Stock {
    public static int arr[] = new int[5];
    public static HashMap<String, Integer> hmap= new HashMap<>();

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try{
                printStock(hmap);
                throw new InterruptedException();
            }catch (InterruptedException ex){
            }
        }
    });

    public void startPriceGenerator(int[] arr, HashMap hmap) throws InterruptedException {
        Random random = new Random();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        long t= System.currentTimeMillis();
        long end = t+15000;
        while(System.currentTimeMillis() < end) {
            System.out.println(Thread.currentThread().getName()+ "Refreshed prices at: "+  sdf.format(cal.getTime()));

                synchronized (this) {
                    for (int i = 0; i < 5; i++) {
                        int price = generateRandom(random);
                        arr[i] = price;
                    }
                    updateStocks(hmap, arr);

                }
            t2.start();
                    try {
                        System.out.println("sleeping for 100 milliseconds");
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.exit(0);
                    }


        }
    }
    public static int generateRandom(Random random){
        int max=100;
        int min=1;
        int price = min + random.nextInt(max);
        return price;
    }
    public static void updateStocks(HashMap hmap, int[] arr){
        hmap.put("Reliance", arr[0]);
        hmap.put("ICICI", arr[1]);
        hmap.put("TCS", arr[2]);
        hmap.put("BankOfBaroda", arr[3]);
        hmap.put("Cipla ", arr[4]);

    }
    public  void printStock(HashMap hmap)  {
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){

        }

        if(Thread.holdsLock(this))
            System.out.println("SKIP" + Thread.currentThread().getName());
        else
        System.out.println(Thread.currentThread().getName()+ hmap);
     //   Thread.currentThread().yield();

    }





    public static void main(String args[]){
      final Stock stock= new Stock();
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               try{
                   stock.startPriceGenerator(arr, hmap);
               }catch (InterruptedException ex){
                   System.exit(0);
               }
           }
       });


       t1.start();

       /* try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
     */
    }
}
