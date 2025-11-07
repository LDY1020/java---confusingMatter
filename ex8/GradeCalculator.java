package test2.ex8;

public class GradeCalculator {

    public static Grade getGrade(int score){
        if(score >= 90){
            return Grade.A;
        }else if(score >= 80){
            return Grade.B;
        }else if(score >= 70){
            return Grade.C;
        }else if(score >= 60){
            return Grade.D;
        }else{
            return Grade.F;
        }
    }
}
