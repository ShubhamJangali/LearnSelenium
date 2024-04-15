package Java.Practice;

class encapsul {
    private String name = "Shubham";
    private int age = 23;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class EncapsulationExample {
    public static void main(String[] args) {
        encapsul en = new encapsul();
        System.out.println(en.getAge());
        en.setName("shubham jangali");
        System.out.println(en.getName());
    }
}
