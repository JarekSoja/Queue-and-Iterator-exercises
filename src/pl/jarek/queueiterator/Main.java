package pl.jarek.queueiterator;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> fifo = new ArrayDeque<>();
        ArrayDeque<Integer> lifo = new ArrayDeque<>();

        for(int i = 0; i < 50; i++){
            fifo.offer(i);
            lifo.push((49-i));
        }

        Iterator<Integer> fifoIter = fifo.iterator();
        Iterator<Integer> lifoIter = lifo.iterator();

        while (fifoIter.hasNext()){
            int temp = fifoIter.next();
            System.out.println(temp);
        }

        System.out.println("FIFO size = " + fifo.size());

        while (lifoIter.hasNext()){
            int temp = lifoIter.next();
            System.out.println(temp);
        }

        System.out.println("LIFO size = " + lifo.size());

        while (fifo.peek() != null){
            int temp = fifo.poll();
            System.out.println(temp);
        }

        System.out.println("FIFO size = " + fifo.size());

        while (lifo.peek() != null){
            int temp = lifo.pop();
            System.out.println(temp);
        }

        System.out.println("LIFO size = " + lifo.size());


        }
}
