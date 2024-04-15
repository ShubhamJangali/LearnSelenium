package Java;

class example{
    public example(){
        System.out.println("Baseclass constructor is called");
    }
}
class example1 extends example{
    public void show(){
        System.out.println("Show");
    }
    public example1(){
        System.out.println("Baseclass construtor called");
    }
    public example1(int a){
        this();
        System.out.println("Baseclass parameterized construtor called ");
    }

}

public class constructor {
    public static void main(String[] args) {
        example1 exe = new example1(10);
    }
}



