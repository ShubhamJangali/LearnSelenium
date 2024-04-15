package Java.Array;

import java.util.Scanner;

public class Find_Even_Number {
    public static void main(String[] args) {
        System.out.println("Enter Range of your Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
