import srp.*;
import ocp.*;
import lsp.*;
import isp.*;
import dip.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nSRP\n");

        UserManager userManager = new UserManager();
        userManager.addUser(new User("example@domain.com", "password123"));
        userManager.addUser(new User("invalid-email", "1234"));


        System.out.println("\nOCP\n");

        INotificationService emailNotification = new EmailsNotification();
        INotificationService smsNotification = new SMSNotification();
        INotificationService pushNotification = new PushNotification();
        INotificationService faxNotification = new FaxNotification();

        emailNotification.sendNotification("Hello via Email!");
        smsNotification.sendNotification("Hello via SMS!");
        pushNotification.sendNotification("Hello via Push Notification!");
        faxNotification.sendNotification("Hello via Fax!");

        System.out.println("\nLSP\n");

        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((WalkAnimal) dog).walk();

        fish.makeSound();

        System.out.println("\nISP\n");

        PowerDevice phone = new Phone();
        PowerDevice camera = new DisposableCamera();

        phone.turnOn();
        phone.turnOff();
        ((Rechargeable) phone).charge(); 

        camera.turnOn();
        camera.turnOff();

        System.out.println("\nDIP\n");

        PaymentService creditCardPaymentService = new CreditCardPaymentService();
        PaymentService PayPalPaymentService = new PayPalPaymentService();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardPaymentService);
        PaymentProcessor payPalProcessor = new PaymentProcessor(PayPalPaymentService);

        creditCardProcessor.makePayment("#1234", 150.0);
        payPalProcessor.makePayment("#5678", 300.0);
    }

}
