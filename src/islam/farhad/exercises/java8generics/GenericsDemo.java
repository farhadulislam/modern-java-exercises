package islam.farhad.exercises.java8generics;

import islam.farhad.exercises.java8record.Employee;

public class GenericsDemo {
    public static void main(String[] args) {
        Employee employeeFarhad = new Employee("DemoGenerics", "Demo");
        print(employeeFarhad,  2025);
    }

    private static <T, S> void  print(T t, S s) {
        System.out.println(t);
        System.out.println(s);
    }

    private static <T, S> T  getAnEmployee(T t, S s) {
        System.out.println(t);
        System.out.println(s);
        return t;
    }
}
