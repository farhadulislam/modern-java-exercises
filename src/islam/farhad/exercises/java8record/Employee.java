package islam.farhad.exercises.java8record;

public record Employee(String employeeId, String employeeName) {
    private static final String DEMO_WORD = "DEMO";

   public Employee{
        if (employeeId.isBlank()) {
            throw new IllegalArgumentException("Argument shouldn't be empty");
        }
    }
    private String sayHello(){
        return "Hello";
    }

    public static String printAMessage(){
        return "Hello";
    }

}
