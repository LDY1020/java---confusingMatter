package matter.ex7;

public class PushChannel implements NotificationChannel{
    private boolean highPriority;

    PushChannel(boolean highPriority){
        this.highPriority = highPriority;
    }

    @Override
    public void send(String message) {
        System.out.println("[PUSH] : " + message);
    }

    public boolean isHighPriority(){
        return highPriority;
    }
}
