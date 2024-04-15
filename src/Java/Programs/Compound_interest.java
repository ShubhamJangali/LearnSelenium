package Java.Programs;

import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
//        A = P (1+r/n)^nt
//        P = principal
//        r = rate of interest
//        n = number of times interest is compounded per year
//        t = time (in years)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Ammount");
        double P = sc.nextDouble();
        System.out.println("Enter your Rate of Interest");
        double r = sc.nextDouble();
        System.out.println("Enter number of times interest is compounded per year");
        double n = sc.nextDouble();
        System.out.println("Enter number of time");
        double t = sc.nextDouble();
        double result = Math.pow(1+(r/n),n*t);
        System.out.println("The Compound interest is "+P*(result));

    }
}
