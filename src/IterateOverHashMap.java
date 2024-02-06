import java.util.*;

public class IterateOverHashMap {


        public static void main (String args[]) {

            Map<String, Integer> stockPrice = new HashMap<>();
            stockPrice.put("", 34);
            stockPrice.put("Oracle", 434);
            stockPrice.put("NVDIA", 334);
            stockPrice.put("FB", 234);
            stockPrice.put("APPLE", 134);
            System.out.println(stockPrice);

            Set<String> keys  = stockPrice.keySet();
            for(String key : keys ){
                System.out.println(key);
            }

            Collection<Integer> values = stockPrice.values();
            for(Integer value:values)
            {
                System.out.println(value);
            }

        }
}


