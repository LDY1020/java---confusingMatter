package matter.ex1;

public class SmsChannel implements NotiChannel {

    @Override
    public void send(String message) {
        System.out.println("SMS 발송 : " + message);
    }
}
