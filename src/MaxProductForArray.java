import java.util.*;

public class MaxProductForArray {

    public static void main( String [] args) {

        int [] myArray = {5,7,90,100,6,7, 100, 111};
        System.out.println("Using  n2: " + maxProduct(myArray));
        List<Integer> mySet = new ArrayList<>();
        for(int i : myArray) {
            mySet.add(i);
        }
        System.out.println(mySet);

        int length  = mySet.size();
        System.out.println("LENGTH IS " + length);
        int product =mySet.get(length-1);
        System.out.println(product);
        int productOne = mySet.get(length-2);
        System.out.println(product*productOne);



    }

    public static int maxProduct(int [] myArray) {
        int product = 0;

        List<Integer> mySet = new ArrayList<>();
        for (int j = 0; j < myArray.length; j++) {
            for(int y =j+1; y < myArray.length; y++) {
              int temp = myArray[j]*myArray[y];
              if(temp >= product) {
                  product = temp;
              }

            }
        }

        return product;

    }


}
