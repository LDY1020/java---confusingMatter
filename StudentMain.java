package javamatter.ex1;

public class StudentMain {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("도윤" , 90);
		s[1] = new Student("영희" , 80);
		s[2] = new Student("철수" , 70);
		
		int sum = 0;
		int maxScore = 0;
		String maxName = "";
		for(Student s1 : s){
			sum += s1.getScore();
			if(maxScore < s1.getScore()) {
				maxScore = s1.getScore();
				maxName = s1.getName();
				}
		}
		double avg = (double)sum / s.length;
		System.out.println("최고점 학생 : " + maxName);
		System.out.println("학생 평균 점수 : " + avg);
		

	}

}
