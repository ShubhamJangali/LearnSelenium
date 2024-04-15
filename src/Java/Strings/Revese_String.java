package Java.Strings;

public class Revese_String {
    public static void main(String[] args) {
        String str = "Automation";
        String rev = "";

        char arr[] = str.toCharArray();
        char ch;

        for (int i=arr.length-1;i>=0;i--){
            rev = rev+arr[i];
        }

        System.out.println(rev);
    }
}
