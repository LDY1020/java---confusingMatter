package 제네릭.test1;

public class BoxMain {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        Box<Integer> box1 = new Box<>();

        box.set("hello");
        box1.set(10);

        String s = box.get();
        int i =  box1.get();

        System.out.println("s = " + s);
        System.out.println("i = " + i);

    }
}
