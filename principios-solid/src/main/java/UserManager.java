class UserManager {

    private UserRepository userRepository;
    private EmailNotification emailNotification;

    public UserManager() {
        this.userRepository = new UserRepository();
        this.emailNotification = new EmailNotification();
    }

    public void addUser(User user) {

        if (user.isValidEmail() && user.isValidPassword()) {
            userRepository.saveToDatabase(user);
            emailNotification.sendWelcomeEmail(user.getEmail());
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }

}
