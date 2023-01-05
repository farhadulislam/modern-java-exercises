package islam.farhad.exercises.classicProblems;

public class Palindrome {

    public static void main (String ... args){

        System.out.println("Plaindrome Demo");

        isPalindrome("Monsoon");
        isPalindrome_2("madam");
        System.out.println(isPalindrome_2(""));
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
            return (word_reversed.toLowerCase().equals(word.toLowerCase())) ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}

