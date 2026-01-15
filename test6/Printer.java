package 제네릭.test6;

public class Printer {

    public static void printName(Box<? extends Animal> box){
        Animal a = box.getValue();
        System.out.println("printName = " + a.getName());
    }
}
