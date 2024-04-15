package Java.Array.Sorting;

public class Sort_2 {
    public static void main(String[] args) {
//        {1,4,7,6,2,8,10} => {1,5,7} {2,4,6,8,10}
        int arr[] = {1,4,7,6,2,8,10};
        int j=0,k=0,evensize=0,oddsize=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                evensize++;
            }
            else {
                oddsize++;
            }
        }
        int even[] = new int[evensize];
        int odd[] = new int[oddsize];
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even[j++]=arr[i];
            }
            else {
                odd[k++]=arr[i];
            }
        }
       for(int x=0;x<odd.length;x++){
           System.out.print(odd[x]+" ");
       }
        System.out.println("");
        for(int y=0;y<even.length;y++){
            System.out.print(even[y]+" ");
        }
    }
}
//1 7
//4 6 2 8 10