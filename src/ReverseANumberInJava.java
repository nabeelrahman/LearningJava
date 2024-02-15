import java.util.*;

public class ReverseANumberInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    //1234  4321

        //1. Using Algorithm
        int n = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        System.out.println("Reverse Number is using algorithm :" + rev);

        //convert num to String
        String s = String.valueOf(n);
        String reverseString = "";

        for(int i = s.length() -1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }

        System.out.println("Reverse Number is using string:" + reverseString);

        //Using String Buffer and String Builder

        StringBuffer stringInput = new StringBuffer(String.valueOf(n));
        System.out.println("Reverse Number is using string buffer:" + stringInput.reverse());

        List<String> newStringList = new ArrayList<>();

        for(int i = s.length() -1; i >= 0; i--) {
            newStringList.add(String.valueOf(s.charAt(i)));
        }

        System.out.println("Reverse Number is using ArrayList:" + newStringList);

        //Sorting the Numbers using TreeSet:
        TreeSet<String> setStringList = new TreeSet<>();
        for(int i = s.length() -1; i >= 0; i--) {
            setStringList.add(String.valueOf(s.charAt(i)));
        }

        System.out.println("Reverse Number is using sets:" + setStringList);

        HashSet<String> hashSetStringList = new HashSet<>();
        for(int i = s.length() -1; i >= 0; i--) {
            hashSetStringList.add(String.valueOf(s.charAt(i)));
        }

        System.out.println("Reverse Number is using sets:" + hashSetStringList);



    }


}