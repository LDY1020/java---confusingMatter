package test.eenum;

import java.util.Scanner;

public class GradeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("등급을 입력하세요 (BASIC, GOLD, DIAMOND): ");
        String str = sc.nextLine().toUpperCase(); // 소문자 입력 대비

        System.out.print("금액을 입력하세요: ");
        int price = sc.nextInt();

        // 문자열을 Enum으로 변환
        Grade grade = Grade.valueOf(str);

        // 할인 계산
        int discountPrice = price - (price * grade.getDiscount() / 100);

        System.out.println("할인율: " + grade.getDiscount() + "%");
        System.out.println("할인된 금액: " + discountPrice + "원");
    }
}
