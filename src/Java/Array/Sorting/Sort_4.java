package Java.Array.Sorting;

public class Sort_4 {
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

        int A = even.length;
        int B= odd.length;
        int Add[] = new int[A+B];

        for(int i=0;i<even.length;i++){
            Add[i] = even[i];
        }
        for(int i=0;i<odd.length;i++){
            Add[A+i] = odd[i];
        }

        for (int i=0;i<Add.length;i++){
            System.out.print(Add[i]+" ");
        }

    }
}

//4 6 2 8 10 1 7
