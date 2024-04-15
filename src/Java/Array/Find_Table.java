package Java.Array;

import java.util.Scanner;

public class Find_Table {
    public static void main(String[] args) {
        System.out.println("Enter a number you want to form a table");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
