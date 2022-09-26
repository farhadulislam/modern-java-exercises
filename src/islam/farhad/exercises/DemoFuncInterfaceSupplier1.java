package islam.farhad.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DemoFuncInterfaceSupplier1 {

    public static void main(String ... args){

        Supplier<String> supplier = () -> "Hi, this is a supplier";
        System.out.println(supplier.get());

        List<String> strings = Arrays.asList("x", "y", "z");
        System.out.println(strings.stream().findAny().orElseGet(supplier));
    }
}
