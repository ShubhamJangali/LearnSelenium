package Java.Assignment_1;

import java.util.Scanner;

public class Simple_Programs {
    public void area_circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        System.out.println("Area of circle is "+3.14*r*r);
    }
    public void area_Traingle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of Triangle");
        double b = sc.nextDouble();
        System.out.println("Enter Height of Triangle");
        double h = sc.nextDouble();
        System.out.println("The Area of Triangle is "+0.5*b*h);
    }
    public void BMI_Calculator(){
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
    public void even_odd(){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
    public void Greatest_Number(){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("Enter Third Number");
        c = sc.nextInt();

        if (a>b){
            if(a>c){
                System.out.println(a+" is a Greater Number");
            }
            else{
                System.out.println(c+" is a Greater Number");
            }
        }
        if(b>a){
            if(b>c){
                System.out.println(b+" is a Greater Number");
            }
            else {
                System.out.println(c+" is a Greater Number");
            }
        }
    }
    public void Perimeter_Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle");
        double L = sc.nextDouble();
        System.out.println("Enter Width of the Rectangle");
        double W = sc.nextDouble();
        System.out.println("The perimeter of the rectangle is "+(L+W)*2);
    }
    public void Simple_interest(){
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
    public void Swap_Numbers(){
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
