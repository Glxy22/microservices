package MultiThreading;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file" + Thread.currentThread().getName());
        //let the thread call run for 1 sec in main call
        // and then send interrupted to stop the thread
      for(var i=0; i<Integer.MAX_VALUE; i++){

          if(Thread.currentThread().isInterrupted()) break;

          System.out.println("Downloading my file " + i);
      }

       // let the thread run for 6 seconds
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            System.out.println("Download Complete");
//        }
    }
}
