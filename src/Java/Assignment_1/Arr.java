package Java.Assignment_1;

import java.util.Scanner;

public class Arr {
    public void factorial(){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //        int num = 5;
        int fact = 1;
        for(
                int i = 1;
                i<=num;i++)

        {
            fact = fact * i;
        }
        System.out.println(fact);
    }


    public void Fibonacci(int x){
        int count = x;
        int n1=0,n2=1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i=2;i<count;i++){
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
        System.out.println("");
    }
    public void even(){
        System.out.println("Enter Range of your Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    public void MakeTable(){
        System.out.println("Enter a number you want to form a table");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}

