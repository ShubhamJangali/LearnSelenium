package Java.Strings;

import java.util.Arrays;

public class Find_duplicate_along_with_counts {
    public static void main(String[] args) {
        String str = "Automation Test Hub";
        char[] chararray = str.toCharArray();
        Arrays.sort(chararray);
        char currentchar = chararray[0];
        int count=1;

        for (int i=1;i<chararray.length;i++){
            if (chararray[i] == ' ') {
                continue; // Skip spaces
            }
            if (chararray[i]==currentchar){
                count++;
            }
            else {
                if (count>1){
                    System.out.println(currentchar + ":" + count);
                }
                currentchar=chararray[i];
                count=1;
            }
        }

        if (count>1){
            System.out.println(currentchar + ":" + count);
        }
    }
}
