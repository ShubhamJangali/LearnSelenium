package Java.Programs;

import java.util.Scanner;

public class Swapping_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Now Numbers are "+a+" and "+b);
    }
}
