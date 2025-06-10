import User.;
import UserManager;
import userRepository;

import java.util.regex.Pattern;

class UserManager {

    private UserRepository userRepository;
    private EmailNotification emailNotification;

    public void addUser(User user) {

        if (user.isValidEmail() && user.isValidPassword()) {
            userRepository.saveToDatabase(user.getEmail(), user.getPassword());
            emailNotification.sendWelcomeEmail(user.getEmail());

        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }

}
