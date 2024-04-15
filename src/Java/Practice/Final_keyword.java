package Java.Practice;

class change {
    final static double pi;

    static {
        pi = 3.14;
    }

    final public static void print() {
        System.out.println("this is final method");
    }

}

class newchange extends change {
    int b = 20;
}

public class Final_keyword {
    public static void main(String[] args) {
        change c = new change();
        newchange nw = new newchange();
        nw.print();


    }
}
