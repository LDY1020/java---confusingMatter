package 제네릭.test1.test2;

public class SimpleBoxMain {

    public static void main(String[] args) {
        SimpleBox<String> box1 = new SimpleBox<>();
        SimpleBox<Integer> box2 = new SimpleBox<>();

        box1.set("hello");
        box2.set(11);

        String box =  box1.get();
        int b = box2.get();

        System.out.println("box = " + box);
        System.out.println("b = " + b);
    }
}
