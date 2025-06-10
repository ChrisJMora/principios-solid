import UserManager;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        userManager.addUser(new User("example@domain.com", "password123"));
        userManager.addUser(new User("invalid-email", "1234"));
    }

}