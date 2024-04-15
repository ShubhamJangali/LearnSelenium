package Java.Collection;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(100);
        ls.add(200);
        ls.add(300);
        ls.add("Shubham");
        ls.add("Jangali");

        System.out.println(ls);

        System.out.println("=====================================");

        ls.addFirst(0);
        System.out.println(ls);

        System.out.println("=====================================");

        ls.addLast("Bhadgaon");
        System.out.println(ls);

        System.out.println("=====================================");

        ls.removeFirst();
        System.out.println(ls);

        System.out.println("=====================================");

        ls.removeLast();
        System.out.println(ls);

        System.out.println("=====================================");

        System.out.println( ls.getFirst());

        System.out.println("=====================================");

        System.out.println(ls.getLast());

        System.out.println("=====================================");
        ls.clear();;
        System.out.println(ls);

    }
}
