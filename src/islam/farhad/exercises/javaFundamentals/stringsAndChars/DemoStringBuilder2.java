package islam.farhad.exercises.javaFundamentals.stringsAndChars;

public class DemoStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animal");
        sb.insert(0, "-");
        System.out.println(sb.toString());
        sb.insert(7, "-");
        System.out.println(sb.toString());
        sb.insert(4, "-");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.delete(1,3);
        System.out.println(sb2.toString());
        sb2.deleteCharAt(3);
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder("abcdef");
        StringBuilder sb4 = sb3.reverse();
        System.out.println(sb3 +"\t" + sb4);

        StringBuilder country = new StringBuilder("United Kingdom");
        System.out.println(country.reverse().toString());

    }
}
