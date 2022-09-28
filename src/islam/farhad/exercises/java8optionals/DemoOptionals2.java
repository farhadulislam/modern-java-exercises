package islam.farhad.exercises.java8optionals;

import islam.farhad.exercises.java8stream.Customer;

import java.util.List;
import java.util.Optional;

public class DemoOptionals2 {

    public static void main(String ... arguments) {

        Customer customer1 = new Customer("Mohammed", null, List.of("011", "012", "013"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        //This will throw an exception if object is null.
        //Optional<String> emailOptional1 = Optional.of(customer1.getCustomerEmail());
        //System.out.println(emailOptional1);

        Optional<String> emailOptional2 = Optional.ofNullable(customer1.getCustomerEmail());
        System.out.println(emailOptional2); // can't use get() here, as it will throw NoSuchElementException

        //Also, best to check if Optional contains any value before using get()

        if (emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }
        System.out.println(emailOptional2.orElse("default@gmail.com"));
        //orElseGet() method can be used which takes Supplier as argument
        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()-> "dafault@gmail.com ...."));

    }
}
