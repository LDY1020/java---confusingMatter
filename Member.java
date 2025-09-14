package matter.ex3;

public class Member {
    private String name;
    private int borrowed;
    public static int totalBorrowed;

    public Member(String name) {
        this.name = name;
        this.borrowed = 0;
    }

    public void borrowBook(){
        borrowed++;
        totalBorrowed++;
    }
    public void returnBook(){
        if(borrowed > 0){
            borrowed--;
            totalBorrowed--;
        }else{
            System.out.println("반납할 책이 없습니다");
        }
    }
    public void printInfo(){
        System.out.println("회원명 : " + name + " , 현재 대출권 수 : " + borrowed );
    }
    public int getBorrowed(){
        return borrowed;
    }
    public String getName(){
        return name;
    }
}
