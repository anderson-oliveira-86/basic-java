package basic.java.unit14.lesson152;

import basic.java.util.Util;

class ThreadExample extends Thread{
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i%100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable{

    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i%100 == 0){
                System.out.println();
            }
        }
    }
}

public class Lesson152 {
    public static void main(String[] args) {
        Util.printTitle("Threads pt 01 - Introduction");

//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');

        Thread t1 = new Thread(new ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
