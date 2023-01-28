package islam.farhad.exercises.data;

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

    public static List<Employee> getEmployeeList2 (){

        return Arrays.asList(
                new Employee(1, 35,"Allan", "Civil", 54000),
                new Employee(2, 34, "Robin", "Electrical", 23000),
                new Employee(3, 41, "Mark", "Mechanical", 79000),
                new Employee(4,66, "Tim", "Software", 232000),
                new Employee(5, 35,"Raisul", "Civil", 44000),
                new Employee(6, 34, "Bahar", "Electrical", 88000),
                new Employee(7, 41, "Ali", "Mechanical", 99000),
                new Employee(8, 34, "Bahar", "Electrical", 88000),
                new Employee(9, 41, "Jahan", "Mechanical", 99000),
                new Employee(10, 34, "Asif", "Electrical", 88000),
                new Employee(11, 41, "Mazid", "Mechanical", 99000),
                new Employee(12,66, "Wazed", "Software", 132000)

        );
    }
}
