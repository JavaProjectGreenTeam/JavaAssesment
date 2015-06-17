/*
 * Author: Ryan Gallagher
 */

package assesment;

public enum AccountType {
    STANDARD(0),
    ADMIN(1);
    
    private int value;
    
    AccountType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static String getById(int id) {
        for (AccountType e : values()) {
            if (e.getValue() == id) {
                return e.toString();
            }
        }
        return "";
    }
    
    @Override
    public String toString() {
        String output = "";
        
        switch(this.ordinal()) {
            case 0: output = "standard";
                break;
                
            case 1: output = "admin";
                break;
        }
        
        return output;
    }
}
