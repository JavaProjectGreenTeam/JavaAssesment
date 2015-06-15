package assesment;

/**
 *
 * @author 3100298414
 */
public enum Tables {
    INDUSTRY(0),
    CATEGORY(1),
    COURSES(2),
    JOBS(3);
    
    private int value;
    
    Tables(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static String getById(int id) {
        for (Tables e : values()) {
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
            case 0: output = "industry";
                break;
                
            case 1: output = "category";
                break;
                
            case 2: output = "courses";
                break;
                
            case 3: output = "jobs";
                break;
        }
        
        return output;
    }
}
