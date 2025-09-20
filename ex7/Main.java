package matter.ex7;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailChannel());
        notificationService.notify("주문이 접수되었습니다");

        NotificationService notificationService1 = new NotificationService(new SmsChannel());
        notificationService1.notify("배송이 시작되었습니다");

        NotificationService notificationService2 = new NotificationService(new PushChannel(true));
        notificationService2.notify("서버 장애 감지!");

        NotificationService notificationService3 = new NotificationService(new PushChannel(false));
        notificationService3.notify("일간 리포트");
    }
}
