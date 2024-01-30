import java.util.*;

public class HasSetOperations {

    public static void main(String args[]){

        Set<Integer> setOperations = new HashSet<>();

        setOperations.add(23);
        setOperations.add(34);
        setOperations.add(56);

        //Checking if Hash Set is empty
        System.out.println(setOperations.isEmpty());

        setOperations.remove(23);

        System.out.println("Hashset after removing an element " + setOperations);

        setOperations.clear();

        System.out.println("Hash set after performing a clear operation " + setOperations);

        setOperations.add(23);
        setOperations.add(34);
        setOperations.add(56);
        setOperations.add(23);
        setOperations.add(34);
        setOperations.add(56);

        for(int i: setOperations) {
            System.out.println(i);
        }
        Iterator<Integer> itr = setOperations.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        setOperations.forEach(System.out::println);

        List<Integer> list = new ArrayList<>(setOperations);
        Collections.sort(list);
        Iterator<Integer> itrt = list.iterator();
        System.out.println("Convert to Arraylist:");
        while(itrt.hasNext()){
            System.out.println(itrt.next());
        }
    }



}
