package Java.Strings;

public class count_words_in_sentenses {
    public static void main(String[] args) {
        int count=0;
        String str = "hello my name is shubham and i am from bhadgaon";
        String[] arr = str.split(" ");
        for(String s:arr){
            System.out.println(s);
            count++;
        }
        System.out.println(count);
    }
}
