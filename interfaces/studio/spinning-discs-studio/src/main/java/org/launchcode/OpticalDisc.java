package org.launchcode;

public interface OpticalDisc {

    //TODO: Constant declarations
    //can't think of any...


    //TODO: Method declarations
    //I DON'T KNOW IF I WOULD EVEN USE THESE HERE SINCE I AM LEANING TOWARDS IT BEING EASIER TO SET THEM UP IN ABSTRACT. THEY NEED ACCESS TO INSTANCE VARIABLES
    //AND THEY CAN BE WRITTEN TO BE UNIVERSAL FOR BOTH CD AND DVD
    void spinDisc();
    void readDisc();

    void pauseDisk();
    void playDisc();



    //TODO: Static Methods
    //can't think of any... I am confused to how these work...
    /*
    Ok. So, if there was a static method. I could call it in main program, but it would have to be called on the interface itself, and it's not able to be called on the objects created
    from the classes that are implementing the interface? So they are just for utility aspects for the most part, right?
     */


    //TODO: Default Methods
    //can't think of any...


}
