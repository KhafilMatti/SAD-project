package sad;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHashGenerator {

    public static void main(String[] args) {
        String[] passwords = {
                "admin123",
                "lib456",
                "research789",
                "cust123",
                "guest123",
                "alicepass",
                "bobpass",
                "charlie123",
                "unauthuser123"
        };
        for (String password : passwords) {
            String hash = BCrypt.hashpw(password, BCrypt.gensalt());
            System.out.println(password + " -> " + hash);
        }
    }
}
