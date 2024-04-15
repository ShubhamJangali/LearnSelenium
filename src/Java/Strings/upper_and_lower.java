package Java.Strings;

import java.sql.SQLOutput;

public class upper_and_lower {
    public static void main(String[] args) {
        String str = "Shubham Basaraj Jangali";
        char arr[] = str.toCharArray();
        for (int i=0;i<arr.length;i++){
            if (Character.isUpperCase(arr[i])){
                System.out.print(Character.toLowerCase(arr[i]));
            }
            else if (Character.isLowerCase(arr[i])) {
                System.out.print(Character.toUpperCase(arr[i]));
            }
            else {
                System.out.print(arr[i]);
            }
        }
    }
}
