package test2.ex7;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < students.length; i++){
            System.out.println("학생 이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.println("점수를 입력하세요 : ");
            int score = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name,score);
        }

        System.out.println("===결과===");
        int sum = 0;
        for(int i = 0; i < students.length; i++){
            sum += students[i].getScore();
        }
        double avg = (double) sum/ students.length;
        System.out.println("평균 점수 : " + avg);

        int maxScore = students[0].getScore();
        String maxName = students[0].getName();
        int minScore = students[0].getScore();
        String minName = students[0].getName();

        for (int i = 1; i < students.length; i++) {
            if (students[i].getScore() > maxScore) {
                maxScore = students[i].getScore();
                maxName = students[i].getName();
            }
            if (students[i].getScore() < minScore) {
                minScore = students[i].getScore();
                minName = students[i].getName();
            }
        }
        System.out.println("최고점 : " + maxScore);
        System.out.println("최저점 : " + minScore);
    }
}
