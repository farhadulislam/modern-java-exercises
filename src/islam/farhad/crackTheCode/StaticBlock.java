package islam.farhad.crackTheCode;

public class StaticBlock {

    static {
        value = 10;
    }
    private static int value;
    static {
        value = 20;
    }

    public static void main(String[] args) {
        System.out.println(value);
    }
}
