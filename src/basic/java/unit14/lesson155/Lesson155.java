package basic.java.unit14.lesson155;

import basic.java.util.Util;

public class Lesson155 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        Util.printTitle("Threads pt 06 - Sincronismo de thread pt 02");

        Lesson155 threadAccountTest = new Lesson155();
        Thread t1 = new Thread(threadAccountTest , "Hestia");
        Thread t2 = new Thread(threadAccountTest , "Bell Cranel");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("FODEO");
            }
        }
    }

    //Método sincronizado, evitando o paralelismo.
    //também é possível sincronizar apenas a instancia (account)
    private synchronized void withdrawl(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro $");
            account.withdrawl(amount);
            System.out.println(Thread.currentThread().getName() + " Completou o saque, valor atual da conta : " + account.getBalance());
        }else{
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());

        }
    }

}
