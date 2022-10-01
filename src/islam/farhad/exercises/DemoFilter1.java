package islam.farhad.exercises;

import islam.farhad.exercises.javaFundamentals.Employee;
import islam.farhad.exercises.javaFundamentals.EmployeeDB;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoFilter1 {

    public static void main(String ... args){
        List<Integer> ints  = Arrays.asList(9,87,67,3,4,60,61,1);

        ints.stream().filter(i -> i%2==0).forEach(System.out::println);
        int sum = ints.stream().mapToInt(i -> i).sum();
        System.out.println("Sum of all integers : " + sum);

        //Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Amy", 23);
        map.put("Brian", 11);
        map.put("Iftekher", 24);
        map.put("Amin", 38);

        map.forEach((k,v)-> System.out.println(k + ":" + v));
        map.entrySet().stream().forEach((mpaObj)-> System.out.println("Using stream\n" + mpaObj));
        map.keySet().stream().forEach((key)-> System.out.println(key)); // will only print keys .
        //filter
        map.entrySet().stream().filter(k -> k.getValue()%2==0).forEach(obj -> System.out.println(obj));

        //filter example, using Employee class
        List<Employee> taxableEmployeeList = EmployeeDB.getEmployeeList().stream()
                .filter(e -> e.getSalary()>50000)
                .collect(Collectors.toList());
        taxableEmployeeList.forEach(System.out::println);


    }


    private static List<Employee> getTaxableEmployees(String s) {
        //ternary operator
        return (s.equalsIgnoreCase("tax") ?
                EmployeeDB.getEmployeeList()
                .stream()
                .filter(e -> e.getSalary()> 50000)
                .collect(Collectors.toList()) :
                EmployeeDB.getEmployeeList()
                .stream()
                .filter(e -> e.getSalary() <= 50000)
                .collect(Collectors.toList()));
    }
}
