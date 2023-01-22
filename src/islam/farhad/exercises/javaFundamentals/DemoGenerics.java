package islam.farhad.exercises.javaFundamentals;

public class DemoGenerics {

    public static void main (String ... args){

        Printer<Integer> integerToPrint = new Printer<>(23);
        Printer<String> stringToPrint = new Printer<>("A walk to remember");

        integerToPrint.print();
        stringToPrint.print();

        saySomething("Hello");
        saySomething(23);
    }

    private static <T> void saySomething (T something){
        System.out.println(something + " ......");
    }

    private static <T, V> void saySomething2(T something, V theOtherThing){
        System.out.println(something + " " + theOtherThing);
    }

    private static <T, V> T saySomething3 (T something, V theOtherThing){
        System.out.println("Returing a generic TYPE");
        return something;
    }

    private static <T> T returnSth(T value){
        T something = value;
        return something;
    }
}

