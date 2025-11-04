package test2.ex6;

public enum Coffee {

    AMERICANO(1500) ,
    LATTE(2000) ,
    MOCHA(2500) ,
    ESPRESSO(1800);

    private final int price;

    Coffee(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
