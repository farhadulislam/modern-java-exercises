package islam.farhad.exercises.javaFundamentals.stringsAndChars;

public class StringToPrimitiveOrWrapperClass {
    public static void main(String[] args) {
        boolean primitiveBoolean = Boolean.parseBoolean("true");
        Boolean objBoolean =  Boolean.valueOf("TRUE");
        System.out.println(primitiveBoolean + ":\t" + objBoolean);
    }
}
