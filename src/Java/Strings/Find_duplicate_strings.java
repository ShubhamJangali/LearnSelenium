package Java.Strings;

import java.util.Arrays;

public class Find_duplicate_strings {
    public static void main(String[] args) {
        String arr = "hello sir how are you sir";
        String[] str = arr.split(" ");
        Arrays.sort(str);
        String current = str[0];
        int count=1;

        for (int i=1;i<str.length;i++){
            if (current.equals(str[i])){
                count++;
            }
            else {
                if (count>1){
                    System.out.println(current+":"+count);
                }
                current=str[i];
                count=1;
            }
        }
        if (count>1){
            System.out.println(current+":"+count);
        }
    }
}
