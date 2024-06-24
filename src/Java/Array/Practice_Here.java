package Java.Array;

import java.lang.reflect.Array;
import java.util.*;

public class Practice_Here {
    public static void main(String[] args) {
        String str = "hello shubham how are you, are you fine";
        str = str.replace(",","");
        String[] arr = str.split(" ");
        Arrays.sort(arr);
        String currentword = arr[0];
        int count=1;
        for (int i=1;i<arr.length;i++){
            if (currentword.equals(arr[i])){
                count++;
            }
            else {
                if (count>1){
                    System.out.println(currentword+":"+count);
                }
                currentword=arr[i];
                count=1;
            }
        }
        if (count>1){
            System.out.println(currentword+":"+count);
        }
    }
}
