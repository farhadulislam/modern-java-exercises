package islam.farhad.crackTheProblem.StringProblems;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "Farhad";
        System.out.println(reverseMe(input));
        System.out.println(reverseMe(null));
        System.out.println(reverseMe("A"));
    }

    private static String reverseMe(String s) {
        if(s == null)
            return null;
        if (s.length()==0)
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    private static String reverseMeUsingBuiltInReverseMethod(String s) {
        return s == null ? null : new StringBuilder(s).reverse().toString();
    }
}
