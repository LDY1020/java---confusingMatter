package matter.ex4;                         // 같은 패키지(같은 프로젝트 영역)

public class Student {
    private String name;                    // 학생 이름
    private Course[] basket;                // 과목 3개를 담는 바구니(배열)

    public Student(String name) {           // 생성자: 학생 이름만 받음
        this.name = name;                   // 필드 초기화
        this.basket = new Course[3];        // 길이 3 배열 생성 → [null, null, null]로 시작
    }

    public boolean addCourse(Course c){     // 과목 1개를 바구니에 추가(성공/실패 반환)
        if (c == null) return false;        // 방어: null 과목은 거부

        for (int i = 0; i < basket.length; i++) { // 0~2까지 돌면서
            if (basket[i] == null) {        // 비어있는 칸을 찾으면
                basket[i] = c;              // 그 칸에 꽂는다
                return true;                // 성공했으니 즉시 true 반환(루프 종료)
            }
        }
        return false;                       // 빈 칸이 없었다 → 실패
    }

    public int currentCredits(){            // 현재 담긴 과목들의 학점 합
        int sum = 0;                        // 호출할 때마다 0부터 다시 계산(지역변수!)
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {        // 실제 과목이 있는 칸만
                sum += basket[i].getCredit();// 그 과목의 학점을 더한다
            }
        }
        return sum;                         // 총합 반환
    }

    public void printBasket(){              // 바구니 내용과 총 학점 출력
        System.out.println("[" + name + "의 수강바구니]");
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {        // null 아닌 칸만 출력
                basket[i].printInfo();      // 과목 자체가 어떻게 찍힐지는 Course가 책임짐
            }
        }
        System.out.println("총 학점 : " + currentCredits()); // 마지막에 합계
    }
}