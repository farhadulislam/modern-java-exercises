package islam.farhad.classicProblems;

public class Palindrome {
    private static String type;
    private static String type2;
    private static String type3;
    private static String type4;

    public static void main (String ... args){

        System.out.println("Plaindrome Demo");

        isPalindrome("Monsoon");
        isPalindrome_2("madam");
        System.out.println(isPalindrome_2(""));

        isPalindrome3("madam");
    }

    public static void isPalindrome(String word){
        StringBuilder word_reversed = new StringBuilder("");
        for (int i = word.length()-1; i >= 0; i--){
            word_reversed = word_reversed.append(word.charAt(i));
        }
        System.out.println("Word Entered: " + word.toLowerCase());
        System.out.println("Word Reversed: " + word_reversed.toString().toLowerCase());

        if (word_reversed.toString().toLowerCase().equals(word.toLowerCase())){
            System.out.println("Word is a palindrome");
        }else{
            System.out.println("Word is a not palindrome");
        }
    }


    public static Boolean isPalindrome_2(String word){
        if (word != " " && !word.equalsIgnoreCase(null)) {
            String word_reversed = "";
            for (int i = word.length() - 1; i >= 0; i--)
                word_reversed += word.charAt(i);
            return word_reversed.toLowerCase().equals(word.toLowerCase());
        }
        return Boolean.FALSE;
    }
    // Method to check if a string is a palindrome
    public static boolean isPalindrome3(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // Not a palindrome
            }
            start++;
            end--;
            System.out.println("start = " + str.charAt(start));
            System.out.println("end = " + str.charAt(end));
        }

        return true;  // It's a palindrome
    }
}

