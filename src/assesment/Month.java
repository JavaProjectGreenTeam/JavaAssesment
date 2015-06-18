/*
 * Author: Ryan Gallagher
 */

package assesment;

public enum Month {
    ZERO(0),
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    
    private int value;
    
    Month(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static String getById(int id) {
        for (Month e : values()) {
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
            case 0: output = "zero";
                break;
            
            case 1: output = "January";
                break;
                
            case 2: output = "February";
                break;
                
            case 3: output = "March";
                break;
                
            case 4: output = "April";
                break;
                
            case 5: output = "May";
                break;
                
            case 6: output = "June";
                break;
                
            case 7: output = "July";
                break;
                
            case 8: output = "August";
                break;
                
            case 9: output = "September";
                break;
                
            case 10: output = "October";
                break;
                
            case 11: output = "November";
                break;
                
            case 12: output = "December";
                break;
        }
        
        return output;
    }
}
