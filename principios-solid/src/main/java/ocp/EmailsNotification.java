public class EmailsNotification implements INotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}