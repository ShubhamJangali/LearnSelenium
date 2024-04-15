package Java.Programs;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter your Weight in Kg");
        Scanner sc = new Scanner(System.in);
        double W = sc.nextDouble();
        System.out.println("Enter your Height in meter");
        double H = sc.nextDouble();
        double BMI = W/(H*H);
        if(BMI<18.5){
            System.out.println("You are Underweight");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("You have a normal weight");
        }
        else if(BMI>=25 && BMI<=29.9){
            System.out.println("You are overweight");
        }
        else if(BMI>=30 && BMI<=40){
            System.out.println("You are Obesity");
        }
        else {
            System.out.println("No Data Found.......");
        }
    }
}
