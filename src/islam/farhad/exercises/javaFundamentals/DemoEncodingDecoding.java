package islam.farhad.exercises.javaFundamentals;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

public class DemoEncodingDecoding {
    public static void main(String[] args) {

        String text = "This is a text";
        String encodedText = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println("Text : " + text +"\nencoded Text : " + encodedText);


        byte [] decodedArr = Base64.getDecoder().decode(encodedText);
        try {
            String decodedText = new String (decodedArr, "UTF-8" );
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(decodedArr + "decoded to : " + encodedText);


    }

    public void demoStringArray(){
        String[] stringArray = new String[]{"Apple", "Banana"};
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
        Arrays.stream(stringArray).sequential().forEach(System.out::println);
        Arrays.stream(stringArray).map( s -> s.getBytes()).forEach(System.out::println);// turns a String into byte array
    }

}
