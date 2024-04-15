package Java.Array.Patterns;

public class pattern_2 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
//        1
//        12
//        123
//        1234
//        12345
//        1234
//        123
//        12
//        1