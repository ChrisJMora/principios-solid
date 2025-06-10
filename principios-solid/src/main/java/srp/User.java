import java.util.regex.Pattern;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isValidEmail() {
        return email != null && Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", this.email);
    }

    public boolean isValidPassword() {
        return password != null && password.length() >= 8;
    }
}