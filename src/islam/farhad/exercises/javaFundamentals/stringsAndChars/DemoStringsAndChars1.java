package islam.farhad.exercises.javaFundamentals.stringsAndChars;

public class DemoStringsAndChars1 {
    public static void main(String[] args) {

      char [] characterArray = {'a', 'b','c', 'd'};
        System.out.printf("Character array length : %d\n", characterArray.length);

        //String Factory methods
        String stringValueOf =  String.valueOf(characterArray, 0, 2);
        System.out.println(stringValueOf);
        String stringCopyValueOf =  String.copyValueOf(characterArray);
        System.out.println(stringCopyValueOf);


    }
}
