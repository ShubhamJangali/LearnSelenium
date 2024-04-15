package Java;

public class find_duplicate_character {
    public static void main(String[] args) {
        String str = "hellol";
        char[] arr = str.toCharArray();
        for (int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if (arr[i]==arr[j]){
                   System.out.println("Duplicate Character is "+arr[j]);
               }
           }
        }
    }
}
