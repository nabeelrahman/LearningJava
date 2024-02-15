import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsHashMA {

    public static void main(String args[]) {

        Map<String, Integer> newMap = new HashMap<>();

        newMap.put("Oracle", 2000);
        newMap.put("Oracle", 3000);
        newMap.put("Oracle", 3000);
        newMap.put("TEST", 500);
        newMap.put("TESTONE", 200);
        newMap.put("TESTTWO", 100);
        newMap.put("TESTTHREE", 100);
        newMap.put(null, 200);

        System.out.println(newMap);

        newMap.putIfAbsent("Microsoft", 5000);

        System.out.println(newMap);

        //GET TEST ONE PRICE
        System.out.println(newMap.get("TESTONE"));
        //REPLACE TEST ONE PRICE
        newMap.replace("TESTONE", 200, 900);
        newMap.remove("TESTTHREE");
        System.out.println(newMap);

        //Check if key is present
        System.out.println(newMap.containsKey("TESTONE"));
        System.out.println(newMap.containsValue(5000));

        System.out.println("********using iterator statement");

        Iterator<Map.Entry<String, Integer>> iterator = newMap.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("********using a for statement");
        Set<String> keys = newMap.keySet();

        for(String key: keys){
            System.out.println(keys);
        }

        //hashing hashCode() --> hashing







    }




}
