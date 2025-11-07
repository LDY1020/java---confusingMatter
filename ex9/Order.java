package test2.ex9;

public class Order {

    public static int calculateTotal(Menu[] menus) {
        int total = 0;                        // 합계 변수 선언
        for (int i = 0; i < menus.length; i++) {
            total += menus[i].getPrice();
        }
        return total;
    }
}
