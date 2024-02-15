import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        System.out.println(stockPrice);

        int max = 0;
        String company = "";

        for (Entry<String, Integer> entry : stockPrice.entrySet()) {
            if (entry.getValue() > max) {
                company = entry.getKey();
                max = entry.getValue();
            }
        }

        //Highest Stock Price
        System.out.println("Company stock price is " + company);
        int sum = 0;

        //Average Stock Price
        for (Entry<String, Integer> entry : stockPrice.entrySet()) {
            sum = sum + entry.getValue();
        }
        System.out.println("Average sum is: " + sum / stockPrice.size());

        //Remove companies stock price below 50.00
        for (Entry<String, Integer> entry : stockPrice.entrySet()) {
            if (entry.getValue() < 50) {
                stockPrice.remove(entry.getKey(), entry.getValue());
            }
        }
    }
}