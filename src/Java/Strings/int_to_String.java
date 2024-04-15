package Java.Strings;

public class int_to_String {
    public static void main(String[] args) {
        int a = 12321;
        String temp="";
        String str = Integer.toString(a);
        System.out.println(str);
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            temp = ch[i]+temp;
        }
        System.out.println(temp);
        if (str.equals(temp)){
            System.out.println("The given Number is Palimdrom");
        }
        else {
            System.out.println("The given is not Palimdrome ");
        }
    }
}
