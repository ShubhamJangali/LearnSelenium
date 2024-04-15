package Java.Programs;

import java.util.Scanner;

public class Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle");
        double L = sc.nextDouble();
        System.out.println("Enter Width of the Rectangle");
        double W = sc.nextDouble();
        System.out.println("The perimeter of the rectangle is "+(L+W)*2);

    }
}
