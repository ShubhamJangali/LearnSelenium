package Java.Array.Patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if (i==j){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}

//100
//010
//001
