package Java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ls.add(10);
        ls.add(20);
        ls.add("Shubham");
        ls.add("Jangali");

        System.out.println(ls);
        System.out.println("===================================");

        ArrayList ls2 = new ArrayList();
        ls2.add(30);
        ls2.add('H');
        ls2.add(20);
        ls2.add(30);

        ls2.addAll(ls);

        System.out.println(ls2);

        System.out.println("===================================");

        ls2.removeAll(ls);

        System.out.println(ls2);

        System.out.println("===================================");

        System.out.println(ls.size());

        System.out.println("===================================");

        System.out.println(ls.contains(251));

        System.out.println("===================================");

        System.out.println(ls.get(2));

        System.out.println("===================================");

        ls.set(2,"Shubha");
        System.out.println(ls);

        System.out.println("===================================");

        System.out.println(ls.indexOf("Jangali"));

        System.out.println("===================================");

        Iterator itr = ls.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("===================================");

        ls.clear();
        System.out.println(ls);



    }
}
