package Aug_12_2026;

class Login {
    String username;
    String password;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void login(String username, String password) throws Exception {
        if (!this.username.equals(username) || !this.password.equals(password)) {
            throw new Exception("Invalid username or password");
        }

        System.out.println("Login successful");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Login log = new Login("Pitambar", "Pass123");

        try {
            log.login("Pitambar", "Pass123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}