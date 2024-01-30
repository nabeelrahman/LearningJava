import java.util.TreeSet;

public class TreeSetExercise {

    public static void main(String args[]) {

        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};

        TreeSet<Integer> list = new TreeSet<>();
        for(int i: numbers) {
            list.add(i);
        }
        //Numbers greater then 50
        System.out.println(list.tailSet(50));

        //Smallest Integer
        System.out.println(list.getFirst());

        //Largest Integer
        System.out.println(list.getLast());
    }

}
