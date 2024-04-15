package Java.Strings;

public class Convert_upper_to_lower_and_lower_to_upper {
    public static void main(String[] args) {
        String str = "Automation Test Hub";
        String result = str.substring(0).toLowerCase()+str.substring(1,9).toUpperCase()+str.substring(12).toLowerCase()+str.substring(13,15).toLowerCase()+str.substring(17).toLowerCase()+str.substring(18,19).toUpperCase();
        System.out.println(result);
    }
}
