package islam.farhad.exercises.commonTools;

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


    }


}
