package matter.ex1;

public class EmailChannel implements NotiChannel {
    @Override
    public void send(String message) {
        System.out.println("메시지 발송 : " + message);
    }
}
