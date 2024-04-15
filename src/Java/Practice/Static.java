package Java.Practice;

public class Static {
     final int a;
    public Static(){
        a=10;
    }

    public void print(){
        System.out.println(a+10);
    }
    public static void main(String[] args) {
        Static s = new Static();
        s.print();
    }

}

