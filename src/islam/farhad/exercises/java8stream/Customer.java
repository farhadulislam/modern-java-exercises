package islam.farhad.exercises.java8stream;

import java.util.List;
import java.util.stream.Stream;

public class Customer {

    private String customerName;
    private String customerEmail;
    private List<String> customerPhonenumbers;


    public Customer(String customerName, String customerEmail, List<String> customerPhonenumbers) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhonenumbers = customerPhonenumbers;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<String> getCustomerPhonenumbers() {
        return customerPhonenumbers;
    }

    public void setCustomerPhonenumbers(List<String> customerPhonenumbers) {
        this.customerPhonenumbers = customerPhonenumbers;
    }

    protected static List<Customer> getCustomers(){

        return Stream.of(new Customer("Meena", "meena@gmail.com", List.of("4294", "643941")),
                new Customer("Raju", "Raju@gmail.com", List.of("0114294", "011643941")),
                new Customer("Mithu", "bojjat.tiya.pakhi@gmail.com", List.of("0224294", "022643941")),
                new Customer("Bura", "bura.beta@gmail.com", List.of("0334294", "033643941"))).toList();
    }
}
