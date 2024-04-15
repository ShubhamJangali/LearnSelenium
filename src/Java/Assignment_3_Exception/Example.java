
/*
Exceptions used in this programs :-
  1.  InputMismatchException
  2.  IllegalArgumentException
  3.  NullPointerException
  4.  NumberFormatException
  5.  NegativeArraySizeException
  6.  ArrayIndexOutOfBoundsException
  7.  StringIndexOutOfBoundsException
  8.  ArithmeticException
*/


package Java.Assignment_3_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class programs {
    public void Area_Circle() {
        // 3.14*r*r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = 0;
        try {
            r = sc.nextDouble();
            if (r < 0) {
                throw new IllegalArgumentException("The radius cannot be negetive");
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (r < 0) {
            System.out.println("Area of circle is " + 0);
        } else {
            System.out.println("Area of circle is " + 3.14 * r * r);
        }
    }

    public void revstring() {
        String str = null;
        String rev = "";
        try {
            char arr[] = str.toCharArray();
            char ch;

            for (int i = arr.length - 1; i >= 0; i--) {
                rev = rev + arr[i];
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (str == null) {
            System.out.println(rev + null);
        } else {
            System.out.println(rev);
        }
    }

    public void String_to_int() {
        System.out.println("Please enter a String for number conversion");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        try {
            num = Integer.parseInt(str);
            if (num < 0) {
                throw new IllegalArgumentException("Do not enter negetive String");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Please enter a correct String");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Please enter a correct String");
        }
        System.out.println("Here we converted the String into number :" + num);
    }

    public void Area_Triangle() {
        Scanner sc = new Scanner(System.in);
        double b = 0, h = 0;
        try {
            System.out.println("Enter Base of Triangle");
            b = sc.nextDouble();
            System.out.println("Enter Height of Triangle");
            h = sc.nextDouble();
            if (b < 0 || h < 0) {
                throw new IllegalArgumentException("Value cannot be negetive");
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Please enter a correct Value");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("The Area of Triangle is " + 0.5 * b * h);
    }

    public void negetive_array() {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            int arr[] = new int[num];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
            System.out.println("Size of array cannot be negetive");
            e.printStackTrace();
        }
        if (num < 0) {
            System.out.println("User please enter the size of array in positive number");
        } else {
            System.out.println("Execution Ended");
        }
    }

    public void arrayindexoutofbound() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to put in array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Please enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Which index value you want to print");
        int print = sc.nextInt();
        try {
            System.out.println("The index value is : " + arr[print]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Please enter valid index you want to print");

        }
        System.out.println("Execution ended");
    }
    public void stringindexoutofbound(){
        System.out.println("Please enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Please enter a index of String to print the relevant character");
        int num = sc.nextInt();
        try {
            char c = str.charAt(num);
            System.out.println("Here is the character : "+c);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Please enter a correct index");
        }
        System.out.println("Execution ended");
    }
    public void arthmatic(){
        int a = 100;
        int b = 0;
        int c=0;
        try {
             c = a / b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Hello vaibhav");
        }
        System.out.println("The value is "+c);
    }

}

public class Example {
    public static void main(String[] args) {
        programs pg = new programs();
//        pg.Area_Circle();
//        pg.revstring();
//        pg.String_to_int();
//        pg.Area_Triangle();
//        pg.negetive_array();
//        pg.arrayindexoutofbound();
//        pg.stringindexoutofbound();
        pg.arthmatic();
    }
}
