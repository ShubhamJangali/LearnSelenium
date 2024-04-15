package Java.Collection;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Shubham");
        lst.add("jangali");
        lst.add("Bhadgaon");
        lst.add("Kolhapur");
        lst.add("Shubham");

        System.out.println("=========================================");
        System.out.println(lst.get(3));
        lst.remove(4);
        lst.add(0, "Poonam");
        System.out.println("=============================================");


        for (String l : lst) {
            System.out.println(l);
        }
        System.out.println("=============================================");
        System.out.println(lst.size());
        System.out.println(lst.contains("Kolhapur"));

        System.out.println("======================================================");

        Iterator<String> iterator = lst.iterator();
        while (iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
        }

        System.out.println("=========================");

        List<String> sublist = lst.subList(0, 3);
        for (String l : sublist) {
            System.out.println(l);
        }
        System.out.println("===============================");

        Collections.reverse(sublist);
        for (String l : sublist) {
            System.out.println(l);
        }
        System.out.println("===============================");

        Collections.sort(sublist);
        for (String l : sublist) {
            System.out.println(l);
        }
    }
}
