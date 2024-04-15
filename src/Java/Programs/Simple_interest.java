package Java.Programs;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
//        S.I. = (P × R × T)/100, where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number of years.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle or Amount");
        double P = sc.nextDouble();
        System.out.println("Enter Rate of Interest");
        double R = sc.nextDouble();
        System.out.println("Enter Time");
        double T = sc.nextDouble();
        double SI = (P*R*T)/100;
        System.out.println("Simple Interrest of your "+P+" at the rate of "+R+" in time "+T+" is "+SI);
    }
}
