package Java.Programs;

import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter First Number");
        b = sc.nextInt();
        System.out.println("Enter First Number");
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
}
