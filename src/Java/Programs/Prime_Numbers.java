package Java.Programs;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number to find Prime Numbers");
        int num = sc.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if (i%j==1){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }
        }
    }
}
