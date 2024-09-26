package technology;

public abstract class AbstractEntity {

    //TODO: create a variable to keep count of objects instantiated
    private static int nextId = 1;

    private final int id;
    private String brand;
    private int year;
    private String screenMode;



    //TODO: create a constructor
    public AbstractEntity(String brand, int year, String screenMode) {
        this.brand = brand;
        this.year = year;
        this.screenMode = screenMode;
        this.id = nextId;
        nextId++;
    }

    //TODO: Create getters for id and nextId


    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    //TODO: Create Getters/Setters for the fields that came from Computer Class


    public String getScreenMode() {
        return screenMode;
    }

    public void setScreenMode(String screenMode) {
        this.screenMode = screenMode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    //TODO: Create a toString() method to list product info
    public String toString(){
        String newline = System.lineSeparator();
        return "INFORMATION:" + newline +
                "ID: " + getId() + newline +
                "Product: " + getClass() + newline +
                "Brand: " + getBrand() + newline +
                "Year: " + getYear() + newline;
    }


}
