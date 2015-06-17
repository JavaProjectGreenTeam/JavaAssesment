package assesment;

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
    
    //Registers a new user entry in the database
    public boolean register(User user) {
        boolean success;

        //Use the methods of User to call the DBInterface methods.
        /*Example*/ 
        String firstName = user.getFirstName();
        
        success = db.createUser(firstName, null, null, null, 0, 0, 0, null, null); //Replace nulls and 0s with appropriate variables once created
        
        return success;
    }
    
    //Returns a User object based off login information
    public User login(String email, String password) {
        int id;
        String firstName;
        String lastName;
        //Skip email and password. Just use the variables supplied by the method call
        int accountType;
        int sex;
        int state;
        String town;
        String dob;
        
        ResultSet result;
        User user;
        
        //Uses the DBInterface method to find a user based off an email and password
        result = db.getUserLogin(email, password);
        
        if (result != null) {
            try {
                //Retrieve the required variables from the result
                id = result.getInt("id");

                user = new User(id, null, null, email, password, 0, 0, 0, null, null); //Again just replace nulls and 0s with the appropriate variables
                
                return user;
                
            } catch (SQLException ex) {
                Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
    
    //This method is no longer reuired simply seting the user object to null should delete the user object. eg. currentUser = null
    public boolean logout(User user) {
        return false;
    }
}
