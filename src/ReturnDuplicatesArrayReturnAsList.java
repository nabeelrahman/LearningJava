import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReturnDuplicatesArrayReturnAsList {

    public static void main (String[] args) {

        int[] myArray = {1,2,4,4,7, 10, 1, 9, 10};
        String[] myString = {"bob", "bob", "nancy", "davis", "tim","tim"};

        //HashSet will do random order and remove duplicates
        Set<Integer> mySet = new HashSet<>();
        Set<String> myStringSet = new HashSet<>();

        System.out.println("My Array numbers: ");
        for(int array: myArray) {
            System.out.print( array + " ");
            mySet.add(array);
        }
        //
        System.out.println("\n" + "Removing Duplicates: " + mySet);

        System.out.println("My array String: ");
        for(String s : myString){
            System.out.print(s + " ");
            myStringSet.add(s);
        }

        System.out.println("\n" + "Removing Duplicates: " + myStringSet);
        //Sorting is used for Tree Set but it is removing duplicates
        Set<String> sortedSet = new TreeSet<>();
        for(String s: myString) {
            sortedSet.add(s);
        }
        System.out.println("Sorted Set: " + sortedSet);

        //Without removing duplicates:


    }



}
