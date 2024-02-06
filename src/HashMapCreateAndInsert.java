import java.util.HashMap;
import java.util.Map;

public class HashMapCreateAndInsert {

    public static void main (String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 15);
        System.out.println(stockPrice);
        stockPrice.put("Oracle", 18);
        System.out.println(stockPrice);
        stockPrice.put("Oracle", 20);
        System.out.println(stockPrice);





    }
}
