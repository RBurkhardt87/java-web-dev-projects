package technology;

import java.time.LocalDate;

public class Computer extends AbstractEntity  {

    //TODO: DECLARE FIELDS
//    private String brand;
//    private int year;
//    private String screenMode;
    private boolean poweredOn = false;




    //TODO: CREATE THE CONSTRUCTOR
    //Say I wasn't using super to extend the constructor of the Parent Class, would id and nextId++ still be here???
    public Computer(String brand, int year, String screenMode) {
       super(brand, year, screenMode);
    }


    //TODO: DECLARE GETTERS AND SETTERS
    //Took out the other getters/setters since I moved the fields the abstract class


    //DO I NEED THIS HERE SINCE IT IS JUST A VARIABLE FOR THE powerOn() method  <--- I think so if I want to use for testing later
    public boolean isPoweredOn() {
        return poweredOn;
    }


    //DO I NEED THIS HERE SINCE IT IS JUST A VARIABLE FOR THE powerOn() method
    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;
    }




    //TODO: (1) CREATE INSTANCE METHOD: isNew()
    //This method will return a boolean. True if new, false if not. If computer is over two years old, it's old.
    //Maybe I can use the LocalDate.now() along with the year declared as arg.
    public boolean isNew() {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        return currentYear - getYear() <= 2;        //<---- had to change to getYear() since fields are no longer declared inside this class
    }


    //TODO: (2) CREATE INSTANCE METHOD: powerOn()
    //This method will return a String. It will print a welcome message when powerOn() is called     <---- Had to change all field variables to getters
    public boolean powerOn() {
        poweredOn = true;
        System.out.println("\n" + getBrand() + ": Welcome! Your " + getBrand() +
                " computer has powered on and is set to " +
                getScreenMode() + " for your preferred use.\n");
        return true;

        //Wasn't sure how to test a string properly (JUST SEEMED LIKE A LONG STRING TO TEST), so I added poweredOn to help with testing as well
        //But... I still can't test a boolean if it is a String method. I switched the method to boolean--- seems like it should be a boolean anyway
        //I need to look into best practices for String return testing. Possibly just store strings in variables that can be printed in unit testing
    }

    //TODO: Create a toString() method to list product info, super in from Abstract Class and and in Computer fields
    public String toString(){
        String newline = System.lineSeparator();
        return super.toString();
    }



}

    //TODO:
    //Probably would want to add a Power Off method too. Maybe after I write the tests, been at this for a minute










