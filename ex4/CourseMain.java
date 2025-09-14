package matter.ex4;                         // 동일 패키지

public class CourseMain {
    public static void main(String[] args) { // main: 실행 시작점(자바 표준)
        Student s = new Student("도윤");     // 학생 객체 생성 → 바구니 [null,null,null]

        // 과목 4개 준비(객체로 만들어둠)
        Course c1 = new Course("CS101",  "자료구조",     3);
        Course c2 = new Course("OS201",  "운영체제",     3);
        Course c3 = new Course("DB101",  "데이터베이스", 3);
        Course c4 = new Course("ENG101", "영어",         2);

        // 바구니 최대 3칸 → 앞 3개는 성공(true), 4번째는 실패(false)
        System.out.println("add c1: " + s.addCourse(c1)); // [c1, null, null]  → true
        System.out.println("add c2: " + s.addCourse(c2)); // [c1, c2,  null]  → true
        System.out.println("add c3: " + s.addCourse(c3)); // [c1, c2,  c3]    → true
        System.out.println("add c4: " + s.addCourse(c4)); // 자리 없음        → false

        s.printBasket();                     // 과목 3개와 총학점(9) 출력
    }
}