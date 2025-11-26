package test5.ex1.ex4;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름을 입력하세요 : ");
            String name = sc.nextLine();

            System.out.println("점수를 입력하세요 : ");
            int score = sc.nextInt();
            sc.nextLine(); // << 여기서 엔터 버퍼 비워주기

            students[i] = new Student(name, score);
        }

        int total = sum(students);
        double avg = average(students);
        int maxIdx = maxIndex(students);
        Student top = students[maxIdx];


        System.out.println("점수의 총합 : " + total);
        System.out.println("평균 점수 : " + avg);
        System.out.println("최고 점수 학생 : " + top.getName() + " (" + top.getScore() + "점)");

    }

    public static int sum(Student[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i].getScore();
        }
        return sum;
    }

    public static double average(Student[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i].getScore();
        }
        return (double) sum /scores.length;
    }


    public static int maxIndex(Student[] scores){
        int maxIndex = 0;
        for(int i = 0; i < scores.length; i++){
        if(scores[i].getScore() > scores[maxIndex].getScore()){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
