public class User {
    private string email;
    private string password;


    public User(string email, string password) {
        this.email = email;
        this.password = password;
    }

    public string getEmail() {
        return this.email;
    }

    public string getPassword() {
        return this.password;
    }
    
    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }


    private boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}