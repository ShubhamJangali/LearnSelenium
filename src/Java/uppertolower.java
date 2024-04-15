package Java;

public class uppertolower {
    public static void main(String[] args) {
        String str = "Shubham Basavraj Jangali";
        char[] ch = str.toCharArray();
        String rev="";
        for (int i=0;i<ch.length;i++){
            if (Character.isUpperCase(ch[i])){
                rev = rev + Character.toLowerCase(ch[i]);
            }
            else{
                rev = rev + Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(rev);
    }
}
