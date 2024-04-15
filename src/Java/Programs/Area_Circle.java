package Java.Programs;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        // 3.14*r*r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        System.out.println("Area of circle is "+3.14*r*r);
    }
}
