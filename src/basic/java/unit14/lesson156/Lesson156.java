package basic.java.unit14.lesson156;

import basic.java.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if(names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}
public class Lesson156 {
    public static void main(String[] args) {
        Util.printTitle("Threads pt 07 - Sincronismo de thread pt 03 - Classes thread safe");

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");

        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();

    }
}
