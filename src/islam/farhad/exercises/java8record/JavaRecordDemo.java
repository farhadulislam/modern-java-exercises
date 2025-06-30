package islam.farhad.exercises.java8record;

public class JavaRecordDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E0001", "Tom");
        System.out.println(employee1.employeeId());
        System.out.println(employee1.employeeName());

    }
}
