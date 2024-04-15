package Java.Assignment_1;

public class Sorting {
    public void ascending(int[] x){
        int arr[] = x;
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
        System.out.println("");
    }
    public void descending(int[] x){
        int arr[] = x;
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public void odd_first_even_later(int[] x){
        int arr[] = x;
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

        for (int i=0;i<even.length;i++){
            Add[B+i]=even[i];
        }

        for (int i=0;i<Add.length;i++){
            System.out.print(Add[i]+" ");
        }
    }
    public void even_first_odd_later(int[] x){
        int arr[] = x;
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
