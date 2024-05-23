package Java.Array;

import java.util.HashSet;
import java.util.Set;

public class uncommon_elements {
    public static void main(String[] args) {
        int[] A = {5,10,15,20};
        int[] B = {10,15,20,25};
        int[] C = {15,25,30,35};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();

        for (Integer num:A){
            setA.add(num);
        }

        for (Integer num:B){
            setB.add(num);
        }

        for (Integer num:C){
            setC.add(num);
        }

        Set<Integer> commonelements = new HashSet<>(setA);
        commonelements.retainAll(setB);
        commonelements.retainAll(setC);

        Set<Integer> allelements = new HashSet<>(setA);
        allelements.addAll(setB);
        allelements.addAll(setC);

        allelements.removeAll(commonelements);

        System.out.println(allelements);
    }
}
