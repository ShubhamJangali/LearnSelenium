package Java;

class Animal{
    public void eat(){
        System.out.println("eating");
    }

    public void sleep(){
        System.out.println("sleeping");
    }

    public void sound(){
        System.out.println("sound");
    }
}
class dog extends Animal{
    public void eat(){
        System.out.println("eating pedigree");
    }

    public void sleep(){
        System.out.println("sleeping at daytime");
    }

    public void sound(){
        System.out.println("barking");
    }

    public void breed(){
        System.out.println("German shepard");
    }
}
public class dynamic {
    public static void main(String[] args) {
        Animal d = new dog();
        d.eat();
    }
}
