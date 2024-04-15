package Java;

public class String_addition {
    public static void main(String[] args) {
        String str = "st@52@6jsdfj*fu#&#^yh3938*2";
        char[] ch = str.toCharArray();
        String temp ="0";
        int sum=0;
        for (int i=0;i<ch.length;i++){
            if (Character.isDigit(ch[i])){
                temp = temp+ch[i];
            }
            else {
                sum = sum + Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));
    }
}
