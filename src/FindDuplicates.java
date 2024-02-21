import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        int [] myArray = {9,5,5,7,5,7,8,10,9,9};
        int length = myArray.length;
        Set<Integer> duplicates = new HashSet<>();

        //traverse through the array
        for(int i = 0; i < length; i++){
            for(int j = i+1; j < length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                    duplicates.add(myArray[j]);
                }

            }
        }
        System.out.println(duplicates);
    }
}
