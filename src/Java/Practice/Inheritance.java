package Java.Practice;

class Animal {
    public Animal(int x){
        System.out.println("Animal class");
    }
    public void makesound() {
        System.out.println("The generic sound");
    }

}

class dog extends Animal {
    public dog(int x){
        super(x);
        System.out.println("dog class");
    }
    public void makesound() {
        System.out.println("Bark");
    }
}

class cat extends dog {
    public cat(int x){
        super(x);
        System.out.println("cat class");
    }
    public void makesound() {
        System.out.println("meow");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        cat a = new cat(10);
        a.makesound();
    }
}
