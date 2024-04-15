package Java;

public class number_reverse {
    public static void main(String[] args) {
        int num = 12345;
        String temp = "";
        String str = Integer.toString(num);
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            temp = ch[i] + temp;
        }

        if(str.equals(temp)){
            System.out.println("Number is palimdrome");
        }
        else{
            System.out.println("Number is not palimdrome");
        }

        int n = Integer.parseInt(temp);
        System.out.println(n);
    }
}
