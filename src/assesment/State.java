/*
 * Author: Ryan Gallagher
 */

package assesment;

public enum State {
    AUSTRALIAN_CAPITAL_TERRITORY(0),
    NEW_SOUTH_WALES(1),
    NORTHERN_TERRITORY(2),
    QUEENSLAND(3),
    SOUTH_AUSTRALIA(4),
    TASMANIA(5),
    VICTORIA(6),
    WESTERN_AUSTRALIA(7);
    
    private int value;
    
    State(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static String getById(int id) {
        for (State e : values()) {
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
            case 0: output = "Australian Capital Territory";
                break;
                
            case 1: output = "New South Wales";
                break;
                
            case 2: output = "Northern Territory";
                break;
                
            case 3: output = "Queensland";
                break;
                
            case 4: output = "South Australia";
                break;
                
            case 5: output = "Tasmania";
                break;
                
            case 6: output = "Victoria";
                break;
                
            case 7: output = "Western Australia";
                break;
        }
        
        return output;
    }
}
