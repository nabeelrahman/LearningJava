import java.lang.reflect.Array;
import java.util.*;

public class HashSetExercise {
    public static void main(String args[]) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate = 0;

        Set <Integer> setOperations = new HashSet<>();

        for (int i: data) {
            if(setOperations.add(i) == false){
                duplicate = i;
            }
        }


        // Your logic will go here

        System.out.println(duplicate);
    }
}

