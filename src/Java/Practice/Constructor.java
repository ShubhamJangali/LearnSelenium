package Java.Practice;

class demo {
    String name;
    int age;
    String address;

    public demo(){
        System.out.println("no argument constructor");
        name = "shubham";
        age = 23;
        address = "Bhadgaon";
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    public demo(int a){
        System.out.println("parameterized constructor");
        name = "poonam";
        age = 24;
        address = "Bhadgaon";
    }
}

public class Constructor {
    public static void main(String[] args) {
        demo a = new demo();
        a.display();
        demo b = new demo(10);
        b.display();

    }
}
