package Java.Strings;

public class Addintion_from_String {
    public static void main(String[] args) {
        String str = "sdZX23%$sH5&L8sdfGJF$$545";
        String temp = "0" ;
        int sum = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                temp = temp +ch;
            }
            else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));

    }
}
