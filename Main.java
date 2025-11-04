package test2.ex6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("커피 종류를 선택하세요 : ");
        String order = sc.nextLine().toUpperCase();

        boolean found = false;
        
        for(Coffee coffee : Coffee.values()){
            if(coffee.name().equals(order)){
                System.out.println(coffee.name() + "의 가격은 " + coffee.getPrice() + "원 입니다");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("해당 커피는 메뉴에 없습니다");
        }
    }
}
