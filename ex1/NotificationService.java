package matter.ex1;

public class NotificationService {

    private NotiChannel channel;

    NotificationService(NotiChannel channel) {
        this.channel = channel;
    }
    public void notify(String message) {
        channel.send(message);
    }
}
