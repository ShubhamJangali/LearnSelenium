package Java.Assignment_2;

public class calc1 {
    static int a;
    static int b;

    public calc1(int x, int y) {
        a = x;
        b = y;
    }

    public static void add() {
        int Sum = a + b;
        System.out.println("Addition is :" + Sum);
    }

    public static void sub() {
        int Sub = a - b;
        System.out.println("Substracttion is :" + Sub);
    }

    public static void mul() {
        int Mul = a * b;
        System.out.println("Multiplication is :" + Mul);
    }

    public static void div() {
        int Div = a / b;
        System.out.println("Division is :" + Div);
    }
}
