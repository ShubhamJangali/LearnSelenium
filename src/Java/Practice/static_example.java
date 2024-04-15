package Java.Practice;
import static java.lang.Math.*;
class example{
    public static class innerclass{
        public static void show(){
            System.out.println("This is inner class ");
        }
    }
}

public class static_example {
    public static void main(String[] args) {
        example.innerclass.show();
        double suareroot = sqrt(25.00);
    }
}
