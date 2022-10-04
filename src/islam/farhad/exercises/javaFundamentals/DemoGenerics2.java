package islam.farhad.exercises.javaFundamentals;

public class DemoGenerics2 {
    public static void main(String[] args) {

    }
}

class MyClass<T>{
    T obj;
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}