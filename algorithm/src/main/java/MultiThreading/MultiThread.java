package MultiThreading;

import java.sql.SQLOutput;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());        //how many threads current application using
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors()); //No of processors in the system
    MultiThread.show();
    }
    public static void show(){
        System.out.println(Thread.currentThread().getName());
//       for(var i=0; i<10; i++) {
//           Thread thread = new Thread(new DownloadFileTask());
//           thread.start();

           // run the thread for 1 second
           //let the thread call run for 1 sec in main call
           // and then send interrupted to stop the thread

           Thread thread = new Thread(new DownloadFileTask());
           thread.start();
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
//               throw new RuntimeException(e);
               e.printStackTrace();
           }

           thread.interrupt();
       }

    }

