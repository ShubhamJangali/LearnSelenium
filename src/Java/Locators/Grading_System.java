package Java.Locators;

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        System.out.println("Please enter your percentage");
        Scanner sc = new Scanner(System.in);
        int perc = sc.nextInt();
        if(perc>=95 && perc<=100){
            System.out.println(" Congrats you got A+ Grate");
        }
        else if(perc>=90 && perc<=94){
            System.out.println(" Congrats you got A Grate");
        }
        else if(perc>=85 && perc<=89){
            System.out.println(" Congrats you got B+ Grate");
        }
        else if(perc>=81 && perc<=84){
            System.out.println(" you got B Grate");
        }
        else if(perc>=71 && perc<=80){
            System.out.println(" you got C+ Grate");
        }
        else if(perc>=61 && perc<=70){
            System.out.println(" you got C Grate");
        }
        else if(perc>=35 && perc<=60){
            System.out.println(" you got D Grate");
        }
        else{
            System.out.println("You are Failed");
        }
    }
}
