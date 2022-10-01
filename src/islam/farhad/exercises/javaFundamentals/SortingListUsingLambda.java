package islam.farhad.exercises.javaFundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListUsingLambda {
    public static void main (String [] args){

        List<Integer> ints = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collections.sort(ints);
        System.out.println("Sorting list using Collections.sort() " + ints);

        Collections.reverse(ints);
        System.out.println("Sorting list using Collections.reverse() " + ints);

        System.out.println("To sort in ascending order");
        ints.stream().sorted().forEach(System.out::println);

        System.out.println("To sort in descending order");
        ints.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Sorting based on a field, so we would use Employee class

        List<Employee> employeeList = EmployeeDB.getEmployeeList();
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary()); // Down casting long to int
            }
        }); // The above can be re-written as following

        Collections.sort(employeeList, (e1, e2)-> (int) (e1.getSalary()-e2.getSalary()));
        System.out.println(employeeList);

        System.out.println("Using stream to sort");
        employeeList.stream().sorted((e1, e2)-> (int) (e1.getSalary()-e2.getSalary())).forEach(System.out::println);

        System.out.println("Using Comparator Comparing method");
        employeeList.stream().sorted((Comparator.comparing(emp -> emp.getSalary()))).forEach(System.out::println);
        System.out.println("Using method reference");
        employeeList.stream().sorted((Comparator.comparing(Employee::getName))).forEach(System.out::println);

    }
}
