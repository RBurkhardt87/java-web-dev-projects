package technology;

import java.time.LocalDate;

public class Computer {

    //TODO: DECLARE FIELDS
    private String brand;
    private int year;
    private String screenMode;



    //TODO: CREATE THE CONSTRUCTOR
    public Computer(String brand, int year, String screenMode){
        this.brand = brand;
        this.year = year;
        this.screenMode = screenMode;
    }


    //TODO: DECLARE GETTERS AND SETTERS
    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public String getScreenMode(){
        return screenMode;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setScreenMode(String screenMode){
        this.screenMode = screenMode;
    }


    //TODO: (1) CREATE INSTANCE METHOD: isNew()
    //This method will return a boolean. True if new, false if not. If computer is over two years old, it's old.
    //Maybe I can use the LocalDate.now() along with the year declared as arg.
    public boolean isNew(){
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        return currentYear - year <= 2;
    }



    //TODO: (2) CREATE INSTANCE METHOD: powerOn()
    //This method will return a String. It will print a welcome message when powerOn() is called
    public String powerOn(){
        return "Welcome! Your " + brand +
                " computer has powered on and set to " +
                screenMode + " for your preferred use.";
    }









}
