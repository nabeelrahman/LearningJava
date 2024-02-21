public class RecursionToReverseAString {

    public static void main (String [] args) {

        stringReverseUsingString("automationHub");
    }

    public static void stringReverseUsingString(String s) {
        if(s == null || s.length() <=1){
            System.out.println(s);
        }
        else {
            System.out.print(s.charAt(s.length() -1));
            stringReverseUsingString(s.substring(0, s.length() -1));
        }
    }
}
