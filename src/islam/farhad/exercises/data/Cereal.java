package islam.farhad.exercises.data;

public enum Cereal {
    TYPE1(2),
    TYPE2(3),
    TYPE3(4);

    private final int price;

    Cereal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
