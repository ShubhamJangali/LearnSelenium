package Java;

public class IlOVEINDIA {
    public static void main(String[] args) {
        String str = "input(%I_*LOVE123INDIA\\\"969)";
        String str2="";
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (Character.isUpperCase(ch[i])){
                str2 = str2+ch[i];
            }
        }
        System.out.println(str2);
    }
}
//Output = IILOVEINDIA