package test2.ex9;

public class Main {

    public static void main(String[] args) {
        Menu[] menu = {new Menu("아메리카노" , 3000) , new Menu("카페라뗴" , 4500) , new Menu("아이스티" , 3500)};

        System.out.println("==== 주문내역 ====");
        for (Menu menu1 : menu) {
            menu1.printInfo();
        }
        System.out.println("총 금액 : " + Order.calculateTotal(menu));
    }
}
