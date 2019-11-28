package Anonymous;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MailExecutorService {

    public static BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();

    static ThreadPoolExecutor executor = null;
    public static void main(String arg[]){
        executor = new ThreadPoolExecutor(5, 10, 5000, TimeUnit.MILLISECONDS, queue);
        executor.prestartAllCoreThreads();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        try {
            MailExecutorService.queue.put(new Task());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        try {
            MailExecutorService.queue.put(new Task());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        try {
            executor.awaitTermination(100000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}