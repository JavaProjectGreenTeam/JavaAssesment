package assesment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//DBinterface done by Nick
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
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            
            result = prepStatement.executeQuery();
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Get a User's stored information based off email and password
    ResultSet getUserLogin(String email, String password) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        try {
            
            /* Prepared statement not working correctly (Parameter index out of range (1 > number of parameters, which is 0).)
            String queryString = "SELECT * FROM user WHERE email = ? AND password = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setString(1, email);
            prepStatement.setString(2, password);
            
            prepStatement.execute();
            //result = prepStatement.executeQuery();
            */
            
            String queryString = "SELECT * FROM user WHERE email = '" + email + "' AND password = '" + password + "'";
            System.out.println(queryString);
            result = statement.executeQuery(queryString);
            
            System.out.println("Result: " + result);
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
                    + " SET lastLogin = NOW()"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            
            prepStatement.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
        //Create a new User entry
    boolean createUser(String firstName, String lastName, String email, String password, int accountType, int sex, int state, String town, Date dob) {
        try {
            String queryString = "INSERT INTO user"
                    + " (id, firstName, lastName, email, password, accountType, sex, state, town, dob, lastLogin)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setNull(1, Types.NULL);
            prepStatement.setString(2, firstName);
            prepStatement.setString(3, lastName);
            prepStatement.setString(4, email);
            prepStatement.setString(5, password);
            prepStatement.setInt(6, accountType);
            prepStatement.setInt(7, sex);
            prepStatement.setInt(8, state);
            prepStatement.setString(9, town);
            prepStatement.setDate(10, dob);
            
            prepStatement.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
        //Update an existing User entry
    boolean updateUser(int userId, String firstName, String lastName, String email, String password, int accountType, int sex, int state, String town, String dob) {
        try {
            String queryString = "UPDATE user"
                    + " SET firstName = ?, lastName = ?, email = ?, password = ?, accountType = ?, sex = ?, state = ?, town = ?, dob = ?, lastLogin = ?"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
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
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
        //Delete a User based off userId
    boolean deleteUser(int userId) {
        try {
            String queryString = "DELETE FROM user"
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            
            prepStatement.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
        //Store a new hisory entry for a user
    boolean storeHistory(int userId, String accessPath) {
        try {
            String queryString = "INSERT INTO userhistory"
                    + " (userId, accessDate, accessPath)"
                    + " VALUES (?, NOW(), ?)";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            prepStatement.setString(2, accessPath);
            
            prepStatement.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
        //Get all history of a user
    ResultSet getHistory(int userId) {
        try {
            String queryString = "SELECT * FROM userhistory"
                    + " WHERE userId = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            prepStatement.setInt(1, userId);
            
            result = prepStatement.executeQuery();
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Get a selector field based off id and tableId
    ResultSet getField(int tableId, int id) {
        try {
            String queryString = "SELECT * FROM " + Tables.getById(tableId)
                    + " WHERE id = ?";
            
            PreparedStatement prepStatement = connection.prepareStatement(queryString);
            //prepStatement.setString(1, Tables.getById(tableId));
            prepStatement.setInt(1, id);
            
            result = prepStatement.executeQuery();
            return result;
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
        //Get a field by its parent information
    ArrayList<ResultSet> getFieldByParent(int parentTableId, int parentId) {
        try {
            ArrayList<ResultSet> resultArray = new ArrayList<>();
            
            for (int i = 1; i <= 3; i++) {
                String queryString = "SELECT * FROM " + Tables.getById(i)
                    + " WHERE parentTable = ? AND parent = ?";
                
                PreparedStatement prepStatement = connection.prepareStatement(queryString);
                prepStatement.setInt(1, parentTableId);
                prepStatement.setInt(2, parentId);
                
                result = prepStatement.executeQuery();
                
                resultArray.add(result);
            }
            
            return resultArray;
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
     
    //get user ID?
    public String getUserName(String email) {
        String Name = "Not Set";
        try {
            String queryString = "SELECT firstName FROM user"
                    + " WHERE email = " + email;
            
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(queryString);
            
            if(rs.next())
            {
                Name = rs.getString("firstName");
                return Name;
            }
            
//            PreparedStatement prepStatement = connection.prepareStatement(queryString);
//            prepStatement.setString(1, email);
            
//            result = prepStatement.executeQuery();
            
//            return Name;
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
}
