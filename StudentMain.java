package test2.ex1;

public class StudentMain {

    public static void main(String[] args) {
        Student[] students = {new Student("도윤" , 90) , new Student("철수" , 70) , new Student("유리" , 80)};

        StudentMain sm = new StudentMain();

        int max = sm.findMax(students);
        String top = sm.findTopName(students);
        double avg =  sm.findAvg(students);

    }

    public int findMax(Student[] students){
        int max = students[0].getScore();
        for (int i = 1; i < students.length; i++){
            if (students[i].getScore() > max){
                max = students[i].getScore();
            }
        }
        System.out.println("최고 점수 : " + max);
        return max;
    }
    public String findTopName(Student[] students){
        String topName = students[0].getName();
        int max = students[0].getScore();
        for (int i = 0; i < students.length; i++){
            if(students[i].getScore() > max){
                topName = students[i].getName();
                max = students[i].getScore();
            }
        }
        System.out.println("1등 학생 : " + topName);
        return topName;
    }

    public double findAvg(Student[] students){
        int sum = 0;
        for (int i = 0; i < students.length; i++){
            sum += students[i].getScore();
        }
        double avg = (double) sum / students.length;
        System.out.printf("평균 점수 : %.2f\n" , avg);
        return avg;
    }
}
