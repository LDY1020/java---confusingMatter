package matter.ex4;

public class Course {

    private String code;
    private String name;
    private int credit;

    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public void printInfo(){
        System.out.println("코드 : " + code + ", 이름 : " + name + ", 학점 : " + credit);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }
}
