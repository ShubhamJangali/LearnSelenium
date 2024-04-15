package Java.Collection;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        // Enqueue (add element)
        qu.offer("Shubham");
        qu.offer("Jangali");
        qu.offer("from");
        qu.offer("Bhadgaon");

        for(String str:qu){
            System.out.println(str);
        }

        // Dequeue ( remove element)
        qu.poll();

        System.out.println("==============");

        for(String str:qu){
            System.out.println(str);
        }

        System.out.println("==============");

        System.out.println(qu.peek());

        System.out.println("==============");

        for(String str:qu){
            System.out.println(str);
        }

    }
}
