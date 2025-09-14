package matter.ex3;

public class MemberMain {

    public static void main(String[] args) {
        Member m1 = new Member("도윤");
        Member m2 = new Member("철수");

        m1.borrowBook();
        m1.borrowBook();
        m1.returnBook();
        m1.printInfo();

        m2.borrowBook();
        m2.borrowBook();
        m2.borrowBook();
        m2.printInfo();

        System.out.println("도서관 전체 도서 대출 권수 : " + Member.totalBorrowed);



    }
}
