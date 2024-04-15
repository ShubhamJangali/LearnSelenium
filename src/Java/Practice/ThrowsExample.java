package Java.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class file {
    public void readandwrite() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        System.out.println("Class readandwrite");
    }

}

public class ThrowsExample {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{
        System.out.println("Execution Started");
        file f = new file();
        f.readandwrite();
//        f.readandwrite();
        Class.forName("Java.Practice.age");
        System.out.println("Mission Successful");
        System.out.println("Execution ended");
    }
}

