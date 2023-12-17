package islam.farhad.exercises.javaFundamentals.stringsAndChars;

public class StringDemo {

    public static void main (String ... args) {

        String name = "Farhad";
        int length = name.length();
        char letter = name.charAt(0);
        boolean isEqual = name.equalsIgnoreCase("FARHAD");
        name.toLowerCase();
        name.toUpperCase();
        name.strip();
        name.indexOf('a');
        name.replace('F', 'D');

        String firstName = "Farhad";
        String lastName = "Islam";
        String middleName = "Ul";
        String fullName = String.format("My name is %3$s %1$s %2$s %nAnd, %1$s is my first name", firstName, middleName, lastName);
        System.out.println(fullName);


    }


}
