package Java.Collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> lst = new LinkedHashSet<>();
        lst.add("Shubham");
        lst.add("jangali");
        lst.add("Bhadgaon");
        lst.add("Kolhapur");
        lst.add("Shubham");

        for(String S : lst){
            System.out.println(S);
        }
    }
}
