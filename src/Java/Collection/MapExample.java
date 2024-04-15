package Java.Collection;

import java.util.HashMap;
import java.util.Iterator;

public class MapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Name","Shubham");
        map.put("age",23);
        map.put("City","Bhadgaon");
        map.put("Pincode",416502);

        System.out.println(map);

        System.out.println("===================================");

        System.out.println(map.get("Pincode"));

        System.out.println("===================================");

        System.out.println(map.containsKey("City") && map.containsValue("Bhadgaon"));

        System.out.println("===================================");

        System.out.println(map.size());

        System.out.println("===================================");

        Iterator itr = map.values().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
