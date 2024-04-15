package Java.Array.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_1 {
    public static void main(String[] args) {
        int arr[] = {3,6,1,2,10,20};

//        Arrays.sort(arr);
//        for (int n:arr){
//            System.out.println(n);
//        }

//        Ascending Order

        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        Descending Order

//        int temp;
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length-1;j++){
//                if (arr[j]<arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
