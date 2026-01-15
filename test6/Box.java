package 제네릭.test6;

public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }
    public Box(T value) {
        this.value = value;
    }
}
