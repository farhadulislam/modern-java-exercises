package islam.farhad.exercises.java8stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

    public static void main (String [] args){

        List<Customer> customers = Customer.getCustomers();

        //One to one mapping meaning each customer can have only email
        List<String> customerEmails = customers.stream()
                .map(c -> c.getCustomerEmail())
                .collect(Collectors.toList());
        System.out.println(customerEmails);


        //One to many mapping using map()
        //Since data is unflattened so we collect it in List of List of String
        List<List<String>> customerPhoneNumbers1 = customers.stream()
                .map(customer -> customer.getCustomerPhonenumbers())
                .collect(Collectors.toList());
        System.out.println(customerPhoneNumbers1);


        //One to many using flatMap() to flatter and transform data
        List<String> customerPhoneNumbers2 = customers.stream()
                .flatMap(customer -> customer.getCustomerPhonenumbers().stream())
                .collect(Collectors.toList());
        System.out.println(customerPhoneNumbers2);


    }
}
