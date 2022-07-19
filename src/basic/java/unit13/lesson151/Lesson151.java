package basic.java.unit13.lesson151;

import basic.java.util.Util;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Lesson151 {
    public static void main(String[] args) {
        Util.printTitle("Streams pt 16 - Parallel Streams pt 01");

        System.out.println("Threads : " + Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumLongParallelStreamIterate(num);
        
    }
    
    private static void sumFor(long num){
        System.out.println("Sum for ");
        long result =0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num ; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate ");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1)
                .limit(num)
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum Parallel Stream Iterate ");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1)
                .parallel()
                .limit(num)
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum Long Stream Iterate ");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L,num)
                .reduce(0L,Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongParallelStreamIterate(long num){
        System.out.println("Sum Parallel Long Stream Iterate ");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1L,num)
                .parallel()
                .reduce(0L,Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }
}
