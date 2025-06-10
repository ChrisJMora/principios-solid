public class SMSNotification implements INotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}