package Java.Practice;

class npc{
    String name;
    int age;
    String address;
    public npc(){
        name = "Shubham";
        age = 23;
        address = "kolhapur";
        System.out.println("Hello my name is "+name+". i am "+age+" years old "+" and i am from "+address);
    }
}
public class Non_Prarameterized_Constructor {
    public static void main(String[] args) {
        npc a = new npc();
    }
}
