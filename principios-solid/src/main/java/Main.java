import srp.*;
import ocp.*;
import lsp.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("SRP");

        UserManager userManager = new UserManager();
        userManager.addUser(new User("example@domain.com", "password123"));
        userManager.addUser(new User("invalid-email", "1234"));


        System.out.println("OCP");

        INotificationService emailNotification = new EmailsNotification();
        INotificationService smsNotification = new SMSNotification();
        INotificationService pushNotification = new PushNotification();
        INotificationService faxNotification = new FaxNotification();

        emailNotification.sendNotification("Hello via Email!");
        smsNotification.sendNotification("Hello via SMS!");
        pushNotification.sendNotification("Hello via Push Notification!");
        faxNotification.sendNotification("Hello via Fax!");

        System.out.println("LSP");

        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((WalkAnimal) dog).walk();

        fish.makeSound();
    }

}
