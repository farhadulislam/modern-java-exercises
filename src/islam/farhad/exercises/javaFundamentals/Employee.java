package islam.farhad.exercises.javaFundamentals;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private long salary;
    private int age;

    public Employee(int id, String name, String dept, long salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(int id,int age, String name, String dept, long salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    //No args constructor
    public Employee(){
        this(2002, "Demo", "Unemployed", 0);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
