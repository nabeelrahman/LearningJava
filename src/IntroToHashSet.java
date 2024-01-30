import java.util.*;

public class IntroToHashSet {

    public static void main(String args[]) {

        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet: " + set.add(23));
        System.out.println("Inserting 23 in the HashSet: " + set.add(33));
        System.out.println("Inserting 23 in the HashSet: " + set.add(43));

        //Fetching an element from a Hash Set
        System.out.println("Fetching an element from a Hash set setNumberTwo" );

        Set<Integer> setNumberTwo = new HashSet<>();
        setNumberTwo.add(55);
        setNumberTwo.add(65);
        setNumberTwo.add(75);
        setNumberTwo.add(75);


        System.out.println( "SetNumber contains 65 is " + setNumberTwo.contains(65));
        System.out.println( "Print hash set setNumberTwo " + setNumberTwo);

        //For duplicates in ArrayList
        List<Integer> arrayListList = new ArrayList<>();
        arrayListList.add(55);
        arrayListList.add(65);
        arrayListList.add(75);
        arrayListList.add(85);

        Iterator<Integer> it = arrayListList.iterator();
        System.out.println("Using a while");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Using a FOR loop");
        for(Integer i: arrayListList){
            System.out.println(i);
        }


    }
}
