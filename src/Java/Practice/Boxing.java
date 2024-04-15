package Java.Practice;

public class Boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;  // Autoboxing
        System.out.println(b);

        Integer c= Integer.valueOf(a);
        System.out.println(b);  //Boxing

        int d = c;
        System.out.println(d);  //Unboxing
    }
}
