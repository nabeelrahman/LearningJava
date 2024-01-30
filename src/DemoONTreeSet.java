import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class DemoONTreeSet {

    public static void main (String args[]) {
        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(4);
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(100);
        list.add(1);
        list.add(3);

        TreeSet<Integer> set = new TreeSet<>(list);

        System.out.println(set);

    }
}
