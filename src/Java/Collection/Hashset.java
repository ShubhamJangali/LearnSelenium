package Java.Collection;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Shubham");
        set.add("Jangali");
        set.add(30);
        set.add(20);
        set.add(null);
        set.add("Shubham");
        set.add(50);
        set.add(30);
        set.add(null);

        System.out.println(set);

        System.out.println("=============================");

        HashSet set2 = new HashSet();
        set2.add(30);
        set2.add("Bhadgaon");
        set2.add('a');
        set2.add("poonam");
        set2.add("Shubham");
        set2.addAll(set);

        System.out.println(set2);

        System.out.println("=============================");

        String str = set2.toString();
        System.out.println(str);

        System.out.println("=============================");

        String[] ch = str.split(",");
        for (String c:ch){
            System.out.println(c);
        }

        System.out.println("=============================");

        System.out.println(set2.contains(20));
        
    }
}
