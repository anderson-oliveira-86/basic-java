package basic.java.unit11.lesson116;

import basic.java.util.Util;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson116 {
    public static void main(String[] args) {
        Util.printTitle("Coleções pt 22 - Queue, PriorityQueue");

        Queue<String> fila = new PriorityQueue();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
            System.out.println(fila);
        }


    }
}
