package Java.arr;

public class Min {
    public static void main(String[] args) {
        int[] arr = {5,20,45,98,23};
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The smallest number is "+min);
    }
}
