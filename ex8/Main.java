package test2.ex8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[5];


        for(int i=0;i<students.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("학생 이름 입력 : ");
            String s = sc.nextLine();
            System.out.println("점수 입력 : ");
            int c =  sc.nextInt();
            sc.nextLine();

            students[i] = new  Student(s,c);
        }


        System.out.println("======결과======");
        for(int i = 0;i < students. length;i++){
            System.out.println(students[i].getName() + " :" + GradeCalculator.getGrade(students[i].getScore()));
        }

    }
}
