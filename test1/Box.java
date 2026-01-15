package 제네릭.test1;

public class Box<T> {

    private T t;

    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
