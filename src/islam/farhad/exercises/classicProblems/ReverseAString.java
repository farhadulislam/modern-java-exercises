package islam.farhad.exercises.classicProblems;

public class ReverseAString {
    public static void main(String[] args) {
        //reverseString("Spring");
        System.out.println(reverseString("Spring"));

    }

    private static String reverseString(String s){
        char [] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while(left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right++;
            System.out.println(charArray);
        }
     return new String(charArray);

    }

}
