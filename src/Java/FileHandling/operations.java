package Java.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class operations {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\HP\\IdeaProjects\\Learnselenium\\src\\Java\\Shubham.txt");
        // f.createNewFile();

        FileWriter fr = new FileWriter(f);
        fr.write("This is Shubham Jangali\n");
        fr.flush();

    }
}
