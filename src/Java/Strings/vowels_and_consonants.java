package Java.Strings;

public class vowels_and_consonants {
    public static void main(String[] args) {
        String str = "My name is shubham jangali";
        String lower = str.toLowerCase();
        int vowels = 0;
        int consonant = 0;
        int space = 0;
        char[] ch = lower.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' ||ch[i]=='u'){
                vowels++;
            }
            else if (Character.isLetter(ch[i])){
                consonant++;
            }
            else{
                space++;
            }
        }

        System.out.println("Total vowels "+vowels);
        System.out.println("Total consonent "+consonant);

    }
}
