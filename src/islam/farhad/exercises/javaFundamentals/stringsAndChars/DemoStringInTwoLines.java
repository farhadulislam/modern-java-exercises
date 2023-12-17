package islam.farhad.exercises.javaFundamentals.stringsAndChars;

public class DemoStringInTwoLines {
    public static void main(String[] args) {
        String firstLine = "FirstLine";
        String secondLine = "Second Line";

        String demo = firstLine + "\r\n" + secondLine;
        System.out.println(demo);
        System.out.println("First line %n Second Line");
        System.out.println(firstLine + "<br>" + secondLine);
    }
}
