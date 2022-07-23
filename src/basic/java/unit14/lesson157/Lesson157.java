package basic.java.unit14.lesson157;

import basic.java.util.Util;

public class Lesson157 {
    public static void main(String[] args) {
        Util.printTitle("Threads pt 08 - Sincronismo de thread pt 04 - Deadlock");

        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
          synchronized (lock1){
              System.out.println("Thread 1 : Segurando lock1");
              System.out.println("Thread 1 : Esperando lock2");

          }
          synchronized (lock2){}
            System.out.println("Thread 1 : Segurando lock2");
        };

        Runnable r2 = () -> {
            synchronized (lock2){
                System.out.println("Thread 2 : Segurando lock2");
                System.out.println("Thread 2 : Esperando lock1");
            }
            synchronized (lock1){}
            System.out.println("Thread 2 : Segurando lock1");
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
