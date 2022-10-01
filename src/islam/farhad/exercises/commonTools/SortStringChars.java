package islam.farhad.exercises.commonTools;

import java.util.Arrays;
import java.util.Locale;

public class SortStringChars {

    public static void main(String[] args) {

        String string = "Springboot";

        char [] stringChars = string.toLowerCase().toCharArray();

        char temp;
        for (int i = 0; i<stringChars.length; i++){
            for(int j = i+1 ; j<stringChars.length; j++){
                if(stringChars[i]>stringChars[j]){
                    temp = stringChars[i];
                    stringChars[i] =stringChars[j];
                    stringChars[j]=temp;

                }
            }
        }
        System.out.println(stringChars);

        /********USING ARRAYS.SORT()********/

        String string2 = "Watermelon";
        char [] charArray = string2.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        StringBuilder sb = new StringBuilder();
        sb.append(stringChars).append(charArray);
        System.out.println(sb);

    }
}
