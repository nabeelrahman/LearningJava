public class SwapNumbersWithoutThirdVariable {

    public static void main (String [] args) {
        swapNumbers(5, 7);
        swapNumbersUsingThirdVariable(5, 7);
    }

    public static void swapNumbers(int x, int y){
        System.out.println("Original Return X: " + x + " Original Return Y: " + y);

        x = x*y;
        y = x/y;
        x = x/y;

        System.out.println("Return X: " + x + " return Y: " + y);

    }

    public static void swapNumbersUsingThirdVariable(int x, int y){
        System.out.println("Original Return X: " + x + " Original Return Y: " + y);

        int thirdNumber;

        thirdNumber = y;
        y = x;
        x = thirdNumber;

        System.out.println("Return X: " + x + " return Y: " + y);

    }
}
