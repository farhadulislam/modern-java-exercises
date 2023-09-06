package islam.farhad.exercises.javaFundamentals;

public class DemoReturn {
 public static void getInteger(int i) {
     if(i<=0)
         return;
     System.out.println(i);

 }
    public static void main(String[] args) {
        getInteger(0);
    }
}
  