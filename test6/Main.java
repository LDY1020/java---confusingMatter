package 제네릭.test6;

public class Main {

    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<Cat> catBox = new Box<>(new Cat());

        Printer.printName(dogBox); // dog
        Printer.printName(catBox); // cat
    }
}
