package islam.farhad.exercises.javaFundamentals;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Comparable Interface abstract method
    @Override
    public int compareTo(Student st) {

        if(this.getId()==st.getId())
            return 0;
        else if (this.getId()> st.getId())
            return 1;
        else
            return -1;
    }
}

