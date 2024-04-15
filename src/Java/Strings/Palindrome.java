package Java.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        char arr[] = str.toCharArray();
        String rev="";

        for (int i=arr.length-1;i>=0;i--){
            rev = rev +arr[i];
        }

        if (str.equals(rev)){
            System.out.println("The given string is Palindrome");
        }
        else {
            System.out.println("The given string is not Palindrome");
        }
    }
}
