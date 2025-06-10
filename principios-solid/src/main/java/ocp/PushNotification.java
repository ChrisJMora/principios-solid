public class PushNotification implements INotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}