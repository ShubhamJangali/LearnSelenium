package Java.Assignment_2;

public class calc {
    int a;
    int b;

    public calc(int x, int y) {
        a = x;
        b = y;
    }

    public void add() {
        int Sum = a + b;
        System.out.println("Addition is :" + Sum);
    }

    public void sub() {
        int Sub = a - b;
        System.out.println("Substracttion is :" + Sub);
    }

    public void mul() {
        int Mul = a * b;
        System.out.println("Multiplication is :" + Mul);
    }

    public void div() {
        int Div = a / b;
        System.out.println("Division is :" + Div);
    }
}
