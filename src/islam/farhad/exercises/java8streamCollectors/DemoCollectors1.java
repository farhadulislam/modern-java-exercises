package islam.farhad.exercises.java8streamCollectors;

import islam.farhad.exercises.data.Employee;
import islam.farhad.exercises.data.EmployeeDB;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoCollectors1 {
    public static void main(String[] args) {
        List<Employee> empList1 =  EmployeeDB.getEmployeeList2();

        Map<Integer, Set<Employee>> empMapByAge = empList1
                .stream()
                .collect(Collectors.groupingBy(emp-> emp.getAge(), TreeMap::new, Collectors.toSet()));

        empMapByAge.entrySet().stream().forEach( System.out::println);

        // List to Map via Collectors
        List<String> cities = Arrays.asList("Abu Dhabi", "Muscat", "Amman", "Tripoli", "Sanaa", "Riyadh", "Doha", "Dhaka" );

        Map<String, String> cityNames = cities.stream().
                map(String::toUpperCase).
                collect(Collectors.toMap(String::new, Function.identity()));
        cityNames.forEach((k,v)-> System.out.println(k +" " + v));

        // Join all elements into a String
        String cityNamesJoined = cities.stream().collect(Collectors.joining(" "));

        System.out.println(cityNamesJoined);
        //Sort duplicates out.
        List<String> citiesWithDuplicateNames = Arrays.asList("Abu Dhabi", "Muscat", "Amman", "Tripoli", "Sanaa", "Riyadh", "Doha", "Dhaka", "Dhaka");
        Set<String> cityNamesUnique = citiesWithDuplicateNames.stream().collect(Collectors.toSet());
        System.out.println(cityNamesUnique);


        //IntSummaryStatistics
        List<Integer> listOfInts = Arrays.asList(12, 23,34,45,67,8,89,90,21,44);
        IntSummaryStatistics stats = listOfInts.stream().collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println("Min " + stats.getMin());
        System.out.println("Max " + stats.getMax());
        System.out.println("Avg " + stats.getAverage());
        System.out.println("Count " + stats.getCount());
        System.out.println("Sum " + stats.getSum());

        //Get stat from Employee class.
        long count = empList1.stream().collect(Collectors.summarizingInt(Employee::getAge)).getCount();
        System.out.println(count);
        /***************** Collectors groupingBy -> Employee age |  dept . JP PLuralsight *****************/
        Map<Integer, List<Employee>>  employeeGroupByAge = empList1
                .stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
        System.out.println(employeeGroupByAge);
        //employeeGroupByAge.entrySet().stream().forEach(System.out::println);

        Map<String, Long> employeeGroupByDept = empList1.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDept(), Collectors.counting()));
        System.out.println(employeeGroupByDept);

        //Number of employees in civil
        System.out.println( "Number of employees in civil : " + employeeGroupByDept.get("Civil"));

        //dept with most employees
        Map.Entry<String, Long> deptWithMostEmployees = employeeGroupByDept.entrySet().stream()
                //.max(Comparator.comparing(entry-> entry.getValue()))
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(deptWithMostEmployees);

    }

}
