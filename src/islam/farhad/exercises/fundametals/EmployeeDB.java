package islam.farhad.exercises.fundametals;

import java.util.Arrays;
import java.util.List;

public class EmployeeDB {

    public static List<Employee> getEmployeeList (){

        return Arrays.asList(
                new Employee(1,"Allan", "Civil", 54000),
                new Employee(1,"Robin", "Electrical", 23000),
                new Employee(1,"Mark", "Mechanical", 79000),
                new Employee(1,"Tim", "Software", 232000)

        );
    }
}
