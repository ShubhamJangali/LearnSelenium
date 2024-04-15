package Java.Collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(20);
        ts.add(60);
        ts.add(5);
        ts.add(54);
        ts.add(1);
        ts.add(30);

        System.out.println(ts);

        System.out.println("===============================");

        System.out.println(ts.contains(30));

        System.out.println("===============================");

        System.out.println(ts.ceiling(21));

        System.out.println("===============================");

        System.out.println(ts.last());

        System.out.println("===============================");

        System.out.println(ts.floor(55));
        
    }
}
