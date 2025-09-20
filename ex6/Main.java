package matter.ex6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();

        Trainer trainer = new Trainer();

        trainer.train(dog);
        trainer.train(cat);
        trainer.train(lion);
    }
}
