package Java.Array;

public class common_elements {
    public static void main(String[] args) {
        int[] A = {5,10,15,20};
        int[] B = {10,15,20,25};
        int[] C = {15,25,30,35};

        for (int i=0;i<A.length;i++){

            for (int j=0;j<B.length;j++){

                for (int k=0;k<C.length;k++){
                    if (A[i]==B[j]&&B[j]==C[k]){
                        System.out.print(A[i]+" ");
                    }
                }
            }
        }
    }
}
