package Java.Strings;

import Java.Collection.Hashset;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class PracticeHere {
    public static void main(String[] args) {
        String str = "sdZX23%$sH5&L8sdfGJF$$545";
        String number="";
        String letters="";
        String symbols="";
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                number = number+str.charAt(i);
            }
            else if (Character.isLetter(str.charAt(i))){
                letters = letters + str.charAt(i);
            }
            else{
                symbols = symbols + str.charAt(i);
            }
        }

        System.out.println(number);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
