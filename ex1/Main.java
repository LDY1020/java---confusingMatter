package matter.ex1;

public class Main {
    public static void main(String[] args) {
        NotificationService s1 = new NotificationService(new EmailChannel());
        NotificationService s2 = new NotificationService(new SmsChannel());

        s1.notify("회원가입을 축하합니다!");
        s2.notify("비밀번호가 변경되었습니다");
    }
}
