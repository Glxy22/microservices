package MultiThreading;

import java.sql.SQLOutput;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());        //how many threads current application using
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors()); //No of processors in the system
    }
}
