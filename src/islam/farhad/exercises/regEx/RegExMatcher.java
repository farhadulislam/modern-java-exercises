package islam.farhad.exercises.regEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExMatcher {

    public static boolean matchesPattern(String input, String regex) {
        if (input == null || regex == null) {
            return false; // return false if input or regex is null
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
       // String input = "example123";
        //String regex = "\\w+\\d+";
        String input = "ABC12/123456/Z/XYZ";
        String regex = "^[A-Z]{3}[0-9]{2}\\/[0-9]{6}\\/?[A-Z]{3}$";

        boolean result = matchesPattern(input, regex);
        System.out.println("Match found: " + result);
    }
}

