package islam.farhad.exercises.javaFundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_regEx1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("Abc1");
        boolean found = m.find();
        System.out.println("found : " + found);
    }
}
