package assesment;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 5050630103
 */
public class UserHandler {
    DBInterface db = new DBInterface();
    
  
    public boolean register(User user) {
        boolean success;

      
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String email = user.getEmail();
        String password = user.getPassword();
        int accountType = user.getAccountType();
        int sex = user.getSex();
        int state = user.getState();
        String town = user.getTown();
        Date dob = user.getDob();
        success = db.createUser(firstName, lastName, email, password, accountType, sex, state, town, dob); 
        
        return success;
    }
    
    
    public User login(String email, String password) {
        int id;
        String firstName;
        String lastName;              
        
        int accountType;
        int sex;
        int state;
        String town;
        Date dob;
        
        ResultSet result;
        User user;
        
       
        result = db.getUserLogin(email, password);
        
        if (result != null) {
            try {
                
                id = result.getInt("id");
                firstName = result.getString("firstName");
                lastName = result.getString("lastName");
                email = result.getString("email");
                password = result.getString("password");
                accountType = result.getInt("accountType");
                sex = result.getInt("sex");
                state = result.getInt("state");
                town = result.getString("town");
                dob = result.getDate("dob");
                

                user = new User(id, firstName, lastName, email, password, accountType, sex, state, town, dob); 
                
                return user;
                
            } catch (SQLException ex) {
                Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
    
    
    public boolean logout(User user) {
        return false;
    }
}
