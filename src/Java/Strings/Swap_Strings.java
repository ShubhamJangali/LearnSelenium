package Java.Strings;

import java.sql.SQLOutput;

public class Swap_Strings {
    public static void main(String[] args) {
        String A = "Shubham";  //A.length() = 7
        String B = "Mukund";   //B.length() = 6

        System.out.println("=======================================");

        A = A+B;                                                        // ShubhamMukund  A.length = 13
        System.out.println(A);
        B = A.substring(0,(A.length()-B.length()));                     // A.substring(0,-(13-6)) = Shubham
        System.out.println(B);
        A = A.substring(B.length());                                    // A.substring(7) = Mukund
        System.out.println(A);

        System.out.println("=========================================");

        System.out.println("Now A is :"+A);
        System.out.println("Now B is :"+B);
    }
}

//A = ShubhamMukund
//B = 0,7-6 = 0,1 = Sh
//A = 6 = Shubham
