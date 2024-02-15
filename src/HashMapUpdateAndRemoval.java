import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUpdateAndRemoval {

    public static void main (String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("", 34);
        stockPrice.put("Oracle", 434);
        stockPrice.put("NVDIA", 334);
        stockPrice.put("FB", 234);
        stockPrice.put("APPLE", 134);
        System.out.println(stockPrice);

        //Get oracle
        System.out.println(stockPrice.get("Oracle"));
        //Get FB
        System.out.println(stockPrice.get("FB"));
        //Get value if not present and assign a default value
        System.out.println(stockPrice.getOrDefault("GOOGLE", 100));
        System.out.println(stockPrice);
        //Replace a value using replace(K key, V value):
        System.out.println(stockPrice.replace("APPLE", 1034));
        System.out.println(stockPrice.get("APPLE"));
        stockPrice.replaceAll((k,v) -> v+10);
        System.out.println(stockPrice);

        //Cheking if key or value exists
        System.out.println(stockPrice.containsKey("SHIFT"));
        System.out.println(stockPrice.containsValue(1044));

        Set<String> keys  = stockPrice.keySet();
        for(String key : keys ){
            System.out.println(keys);
        }

    }
}
