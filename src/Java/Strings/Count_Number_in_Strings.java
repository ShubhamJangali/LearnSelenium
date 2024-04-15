package Java.Strings;

public class Count_Number_in_Strings {
    public static void main(String[] args) {
        String str = "automation test hub";
        int count=0;
        char st[] = str.toCharArray();
        for (int i=1;i<st.length;i++){
            if (st[i]=='t'){
                count++;
            }
        }
        System.out.println(count);
    }
}
