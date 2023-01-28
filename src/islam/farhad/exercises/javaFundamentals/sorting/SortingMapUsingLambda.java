package islam.farhad.exercises.javaFundamentals.sorting;


import islam.farhad.exercises.data.Employee;

import java.util.*;

public class SortingMapUsingLambda {
    public static void main(String [] args){

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Two", 2);
        map1.put("One", 1);
        map1.put("Three", 3);
        map1.put("Five", 5);


        //create a List of type Entry<String, Integer>, and pass in map1.entry() to constructor.
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map1.entrySet());

        /**********Sort pre-java8 way ******************/
        /*Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        // The above could be rewritten using lambda expression
        // That is - implement anonymous method compare of Comparator interface and pass that as 2nd argument into Collections.sort()
        // Note that compare() method itself uses compareTo() method of Comparable interface.
        // Comparable interface -> compareTo()
        // Comparator interface -> compare()

        /**********SORT using lambda exp. ******************/
        System.out.println("\nSorting using lambda expression");
        Collections.sort(entryList, (o1,o2)-> o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /**********SORT using Stream API ******************/
        System.out.println("\nSorting using Stream API - comparing by key");
        map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("\nSorting using Stream API - comparing by value");
        map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        /**********SORT Map keys based on fields such as Employee object if used as Map Key can have
         * multiple fields such as name, age, salary ******************/


        Employee emp1 = new Employee(23, "Newton", "Physics", 12000);
        Employee emp2 = new Employee(33, "Dalton", "Chemistry", 56000);
        Employee emp3 = new Employee(43, "Linnaeus", "Genetics", 75000);
        Employee emp4 = new Employee(53, "Pythagoras", "Math", 3900);

        // Overloaded TreeMap<>() constructor takes a comparator obj
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2)-> (int) (o1.getSalary() - o2.getSalary()));
        employeeMap.put(emp1, 1001);
        employeeMap.put(emp2, 2001);
        employeeMap.put(emp3, 3001);
        employeeMap.put(emp4, 4001);

        System.out.println("\nSorting using Stream API in descending order");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())) // reverse() to sort in descending order
                .forEach(System.out::println);
        System.out.println("\nSorting according to dept");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
                .forEach(System.out::println);
    }
}
