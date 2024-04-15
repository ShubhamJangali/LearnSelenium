package Java.Array.Sorting;

public class Sort_3 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 6, 2, 8, 10};
        int  evensize = 0, oddsize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evensize++;
            } else {
                oddsize++;
            }
        }
        int j = 0, k = 0;
        int even[] = new int[evensize];
        int odd[] = new int[oddsize];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[j++] = arr[i];
            } else {
                odd[k++] = arr[i];
            }
        }

        // to find the length of the odd[]
        int A = even.length;

        // to find the length of the odd[]
        int B = odd.length;

        //Adding the sum of even[] and odd[] to the Add[]
        int Add[] = new int[A+B];


        for (int p=0;p<odd.length;p++){
            Add[p]=odd[p];
        }

//        for(int i=0;i<Add.length;i++){
//            System.out.println(Add[i]);
//        }


        for (int i=0;i<even.length;i++){
            Add[B+i]=even[i];
        }

        for (int i=0;i<Add.length;i++){
            System.out.print(Add[i]+" ");
        }

    }

}

//1 7 4 6 2 8 10
