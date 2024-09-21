package technology;

import java.time.LocalDate;

public class Computer {

    //TODO: DECLARE FIELDS
    private String brand;
    private int year;
    private String screenMode;
    private boolean poweredOn = false;



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

    //DO I NEED THIS HERE SINCE IT IS JUST A VARIABLE FOR THE powerOn() method
    public boolean isPoweredOn(){
        return poweredOn;
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

    //DO I NEED THIS HERE SINCE IT IS JUST A VARIABLE FOR THE powerOn() method
    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;
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
    public boolean powerOn(){
       poweredOn = true;
        System.out.println("\n" + brand + ": Welcome! Your " + brand +
                " computer has powered on and is set to " +
                screenMode + " for your preferred use.\n");
        return true;

        //Wasn't sure how to test a string properly, so I added poweredOn to help with testing as well
        //But... I still can't test a boolean if it is a String method. I switched the method to boolean
        //I need to look into best practices for String return testing.
    }

    //TODO:
    //Probably would want to add a Power Off method too. Maybe after I write the tests, been at this for a minute









}
