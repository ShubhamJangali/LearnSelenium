package Java.Practice;

class pc{
    String name;
    int age;
    String address;

    public pc(String A,int B, String C){
        name = A;
        age = B;
        address = C;
        System.out.println("Hello my name is "+name+". i am "+age+" years old "+" and i am from "+address);
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args) {
        pc b = new pc("shubham",23,"kolhapur");
        
    }
}
