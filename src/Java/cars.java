package Java;

interface car{

    class members {
        public void show(){
            System.out.println("show");
        }
    }
    void milage();
    void luxury();

    int price = 4000;

    default void run(){
        System.out.println("running");
        licence();
    }

     static void breaks(){
        System.out.println("Breaks");
    }

    private void licence(){
        System.out.println("Licence");
    }
}

class bmw implements car{

    public  bmw(){
        System.out.println("constructor of bmw");
    }

    public void milage(){
        System.out.println("Milage");
    }
    public void luxury(){
        System.out.println("Luxury");
        System.out.println(price);
    }
}

public class cars {
    public static void main(String[] args) {
        bmw b= new bmw();
        b.milage();
        b.luxury();
        b.run();
        car.breaks();
        car.members mem = new car.members();
        mem.show();
    }
}
