package islam.farhad.exercises.javaFundamentals;

public class DemoStringBuilder {
    public static void main(String[] args) {
        //Common StringBuilder methods
        StringBuilder sb = new StringBuilder("Monsoon");
        sb.insert(0, 'A');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.setCharAt(6,'r');
        System.out.println(sb);

        StringBuilder sayHello = new StringBuilder("Hello");
        sayHello.append(", welcome.").append("This is a StringBuilder");
        System.out.println(sayHello);

        //Flip chars of sb
        StringBuilder sb2 = new StringBuilder("Palindrome");

        for(int i = 0; i<sb.length()/2; i++){

            int front = i;
            int back = sb2.length()-1-i;

            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);

            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);

        }

        System.out.println(sb2);
    }
}
