package Java.arr;

public class Rev {
    public static void main(String[] args) {
        int[] arr = {15,45,85,65,99};
        int[] rev = new int[arr.length];
        int index=0;
        for (int i=arr.length-1;i>=0;i--){
            rev[index] = arr[i];
            index++;
        }

        for (int r:rev){
            System.out.println(r);
        }
    }
}
