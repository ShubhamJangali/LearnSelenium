
//These two strings are anagrams of each other because they contain the same set of characters, just arranged differently.
//You can rearrange the letters of one string to form the other.
// also number of characters are same
// Example
// triangle = integral
// listen = silent

package Java.Strings;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        int[] num = {5,6,4,8,45,6,1,43,9};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("========================================");

        System.out.println("Find the String is Anagram or not");

        String str1 = "triangle";
        String str2 = "integral";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String sort1 = Arrays.toString(ch1);
        String sort2 = Arrays.toString(ch2);


        // First Method

        if (sort1.equals(sort2)){
            System.out.println("The "+str1+" and "+str2+" are anagrams");
        }
        else {
            System.out.println("The "+str1+" and "+str2+" are not anagrams");
        }

        // Second Method

        if (Arrays.equals(ch1,ch2)){
            System.out.println("The "+str1+" and "+str2+" are anagrams");
        }
        else{
            System.out.println("The "+str1+" and "+str2+" are not anagrams");
        }
    }
}
