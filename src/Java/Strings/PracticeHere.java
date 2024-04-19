package Java.Strings;

import Java.Collection.Hashset;

import javax.sound.midi.Soundbank;
import java.util.*;

public class PracticeHere {
    public static void main(String[] args) {
        String str = "My name is shubham jangali";
        char[] ch = str.toLowerCase().toCharArray();
        int vovels = 0;
        int consonents = 0;
        int spaces = 0;

        for(int i=0;i<ch.length;i++){
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                vovels++;
            }
            else if (ch[i]==' '){
                spaces++;
            }
            else {
                consonents++;
            }
        }

        System.out.println("vovels count is "+vovels);
        System.out.println("consonents count is "+consonents);
        System.out.println("spaces count are "+spaces);
    }
}
