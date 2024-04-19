package Java.Array;

import java.util.Scanner;

public class Practice_Here {
    public static void main(String[] args) {
        int[] arr = {12,54,28,4,5,55,59,2,14,99};
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
