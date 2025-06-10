import User;

// Persistir
public class UserRepository {

    public void saveToDatabase(User user) {
        System.out.println("Saving user to the database...");
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
    }
}