package islam.farhad.exercises.java8streamCollectors;

import islam.farhad.exercises.javaFundamentals.Employee;
import islam.farhad.exercises.javaFundamentals.EmployeeDB;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DemoGroupingBy1 {
    public static void main(String[] args) {
        List<Employee> empList1 =  EmployeeDB.getEmployeeList2();

        Map<Integer, Set<Employee>> empMapByAge = empList1
                .stream()
                .collect(Collectors.groupingBy(emp-> emp.getAge(), TreeMap::new, Collectors.toSet()));

        empMapByAge.entrySet().stream().forEach( System.out::println);
    }
}
