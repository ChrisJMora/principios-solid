import srp.*;
import ocp.*;

public class Main {

    public static void main(String[] args) {

        System.err.println("SRP");

        UserManager userManager = new UserManager();
        userManager.addUser(new User("example@domain.com", "password123"));
        userManager.addUser(new User("invalid-email", "1234"));


        System.err.println("OCP");

        INotificationService emailNotification = new EmailsNotification();
        INotificationService smsNotification = new SMSNotification();
        INotificationService pushNotification = new PushNotification();
        INotificationService faxNotification = new FaxNotification();

        emailNotification.sendNotification("Hello via Email!");
        smsNotification.sendNotification("Hello via SMS!");
        pushNotification.sendNotification("Hello via Push Notification!");
        faxNotification.sendNotification("Hello via Fax!");
    }

}