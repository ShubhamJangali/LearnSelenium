package Java.Practice;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Execution Started");
        int a,b,c=0;
        int arr[] = new int[3];
        a=10;
        b=2;
//        try{
////            c=a/b;
//
//            arr[0] = 1;
//            arr[1] = 2;
//            arr[2] = 3;
//            arr[3] = 4;
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Finally block");
//        }

        try{
            c = a/b;
            System.out.println("try block printed");

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("catchblock printed");
        }

        System.out.println(c);
        System.out.println("Execution Ended");
    }
}
