package Java.Practice;

import java.util.Scanner;



public class age {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new ageException("you are not eligible for voting");
            } else {
                System.out.println("You are eligible for voting");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("execution ended here");
    }
}
class ageException extends Exception{
    public ageException(String msg){
        super(msg);
    }
}
