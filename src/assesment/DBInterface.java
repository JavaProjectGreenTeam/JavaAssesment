package assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3100298414
 */
public class DBInterface {
    //Initialize & Define Variables
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    
    
    //Database Connection Method
    DBInterface() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/findmycareer", "root", "");
            statement = connection.createStatement();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    //Database Interaction Methods
        //Get all users in database
    ResultSet getAllUsers() {
        try {
            String queryString = "SELECT * FROM user";
            result = statement.executeQuery(queryString);
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Get a User's stored information based off userId
    ResultSet getUser(int userId) {
        try {
            String queryString = "SELECT * FROM user"
                    + " WHERE id = '" + userId + "'";
            result = statement.executeQuery(queryString);
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Get a User's stored information based off email and password
    ResultSet getUserLogin(String email, String password) {
        try {
            String queryString = "SELECT * FROM user"
                    + " WHERE email = '" + email + "' AND password = '" + password + "'";
            result = statement.executeQuery(queryString);
            
            updateUserLastLogin(result.getInt("id"));
            
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Update a User's last login time
    boolean updateUserLastLogin(int userId) {
        try {
            String queryString = "UPDATE user"
                    + " SET lastLogin = NOW"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            
            prepStatement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
        //Create a new User entry
    boolean createUser(String firstName, String lastName, String email, String password, int accountType, int sex, int state, String town, String dob) {
        try {
            String insertString = "INSERT INTO user"
                    + " (id, firstName, lastName, email, password, accountType, sex, state, town, dob, lastLogin)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement prepStatement = connection.prepareStatement(insertString);
            prepStatement.setNull(1, Types.NULL);
            prepStatement.setString(2, firstName);
            prepStatement.setString(3, lastName);
            prepStatement.setString(4, email);
            prepStatement.setString(5, password);
            prepStatement.setInt(6, accountType);
            prepStatement.setInt(7, sex);
            prepStatement.setInt(8, state);
            prepStatement.setString(9, town);
            prepStatement.setString(10, dob);
            prepStatement.setString(11, "NOW");
            
            prepStatement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        //Update an existing User entry
    boolean updateUser(int userId, String firstName, String lastName, String email, String password, int accountType, int sex, int state, String town, String dob) {
        try {
            String updateString = "UPDATE user"
                    + " SET firstName = ?, lastName = ?, email = ?, password = ?, accountType = ?, sex = ?, state = ?, town = ?, dob = ?, lastLogin = ?"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(updateString);
            prepStatement.setString(1, firstName);
            prepStatement.setString(2, lastName);
            prepStatement.setString(3, email);
            prepStatement.setString(4, password);
            prepStatement.setInt(5, accountType);
            prepStatement.setInt(6, sex);
            prepStatement.setInt(7, state);
            prepStatement.setString(8, town);
            prepStatement.setString(9, dob);
            prepStatement.setString(10, "NOW");
            prepStatement.setInt(11, userId);
            
            prepStatement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        //Delete a User based off userId
    boolean deleteUser(int userId) {
        try {
            String deleteString = "DELETE FROM user"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(deleteString);
            prepStatement.setInt(1, userId);
            
            prepStatement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        //Store a new hisory entry for a user
    boolean storeHistory(int userId, String accessPath) {
        try {
            String storeString = "INSERT INTO userhistory"
                    + " (userId, accessDate, accessPath)"
                    + " VALUES (?, ?, ?)";
            
            PreparedStatement prepStatement = connection.prepareStatement(storeString);
            prepStatement.setInt(1, userId);
            prepStatement.setString(2, "NOW");
            prepStatement.setString(3, accessPath);
            
            prepStatement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        //Get all history of a user
    ArrayList<String> getHistory(int userId) {
        try {
            
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return new ArrayList<String>();
    }
    
        //Get a selector field based off id and tableId
    ResultSet getField(int id, int tableId) {
        try {
            
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return new ResultSet();
    }
    
        //Get a field by its parent information
    ResultSet getFieldByParent(int parentId, int parentTableId) {
        try {
            
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return new ResultSet();
    }
}
