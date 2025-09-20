package matter.ex7;

public class NotificationService {

    private NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notify(String message){
        if(channel instanceof PushChannel push){
            if(push.isHighPriority() == true){
                System.out.println("[ALERT] 긴급 : " + message);
            }
            push.send(message);
        }else{
            channel.send(message);
        }
    }
}
