package assesment;

/**
 *
 * @author 3100298414
 */
public class Validator {
    public boolean validateEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }
    
    public boolean matchPassword(String pass1, String pass2) {
        if (pass1.equals(pass2)) {
            return true;
        }
        return false;
    }
}
