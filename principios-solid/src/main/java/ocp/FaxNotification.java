public class FaxNotification implements INotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending Fax: " + message);
    }
}