// set interface or LinkedHashSet class is used to store unique because it does not strore duplicate values

package Java.Strings;

import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String str = "aaabbbccdddeeefff";
        LinkedHashSet<Character> character = new LinkedHashSet<>();
        for (char c:str.toCharArray()){
            character.add(c);
        }

        System.out.println(character);

        System.out.println("============================================");


        StringBuffer bf = new StringBuffer();
        for (char c:character){
            bf.append(c);
        }

        System.out.println("Entered String is "+str);
        System.out.println("And the result is "+bf);

        System.out.println("=====================================================");

    }
}
