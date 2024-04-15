package Java.Practice;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Shubham");
        System.out.println(sb);
        sb.append("Bsavraj");
        System.out.println(sb);
        sb.append("Jangali");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
