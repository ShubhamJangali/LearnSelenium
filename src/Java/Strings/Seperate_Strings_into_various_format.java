package Java.Strings;


import com.beust.ah.A;

public class Seperate_Strings_into_various_format {
    public static void main(String[] args) {
        String str = "sdZX23%$sH5&L8sdfGJF$$545";
        char arr[] = str.toCharArray();
        String special_characters="";
        String Numbers="";
        String Uppercase ="";
        String Lowercase="";
        for (int i=1;i<arr.length;i++){
            if (arr[i]>=33 && arr[i]<=47){
                special_characters = special_characters+arr[i];
            } else if (arr[i]>=48 && arr[i]<=57) {
                Numbers = Numbers+arr[i];
            }
            else if (arr[i]>=65 && arr[i]<=90){
                Uppercase = Uppercase+arr[i];
            } else if (arr[i]>=97 && arr[i]<=122) {
                Lowercase = Lowercase+arr[i];
            }
        }
        System.out.println("Special characters :"+special_characters);
        System.out.println("Numbers :"+Numbers);
        System.out.println("Lowercase :"+Uppercase);
        System.out.println("UpperCase :"+Lowercase);


        //OR

//        String str = "sdZX23%$sH5&L8sdfGJF$$545";
//        String digit="";
//        String uppercase="";
//        String lowercase="";
//        String spaces ="";
//        String sp_characters="";
//        char[] ch = str.toCharArray();
//        for (int i=0;i<ch.length;i++){
//            if (Character.isDigit(ch[i])){
//                digit = digit+ch[i];
//            }
//            else if (Character.isUpperCase(ch[i])){
//                uppercase = uppercase + ch[i];
//            }
//            else if (Character.isLowerCase(ch[i])){
//                lowercase = lowercase + ch[i];
//            }
//            else if (ch[i]==' '){
//                spaces = spaces + ch[i];
//            }
//            else {
//                sp_characters = sp_characters +ch[i];
//            }
//        }
//
//        System.out.println(digit);
//        System.out.println(uppercase);
//        System.out.println(lowercase);
//        System.out.println(sp_characters);
//        System.out.println(spaces);
    }
}
