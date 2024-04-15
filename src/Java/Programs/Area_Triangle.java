package Java.Programs;

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        // 1/2 × b × h
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of Triangle");
        double b = sc.nextDouble();
        System.out.println("Enter Height of Triangle");
        double h = sc.nextDouble();
        System.out.println("The Area of Triangle is "+0.5*b*h);

    }
}
