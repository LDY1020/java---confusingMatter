package 제네릭.test1.test2;

public class SimpleBox<T> {

    private T box;

    public void set(T box) {
        this.box = box;
    }
    public T get() {
        return box;
    }
}
