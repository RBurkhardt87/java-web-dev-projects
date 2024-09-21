package technology;

public class Laptop extends Computer {

    //TODO: DECLARE FIELDS
    private boolean charged = true;


    //TODO: CREATE THE CONSTRUCTOR
    public Laptop(String brand, int year, String screenMode){
        super(brand, year, screenMode);
    }


    //TODO: DECLARE GETTERS AND SETTERS
    public boolean isCharged(){
        return charged;
    }

    public void setCharged(boolean charged){
        this.charged = charged;
    }


    //TODO: CREATE INSTANCE METHOD doHomework()
    //This method will be called and switch the value of charged to false
    //so then, if you check battery level, you know it needs to be plugged in
    public String doHomework(){
        charged = false;
        return "\n" + getBrand() + ": You did it! Great Job!! You finished your homework!";
    }



    //TODO: CREATE INSTANCE METHOD checkBatteryLevel()
    //if charged returns true, then print a message saying battery is charged and you can unplug
    //if charged returns false, then print message saying battery is low and must plugin
    public String checkBatteryLevel(){
        if (charged){
            return "\n" + getBrand() + ": I got a lot of life left in me! Feel free to roam around with me.";

        } else {
            return "\n" + getBrand() + ": Whew! I have been working hard, I need to charge up a bit. You can sit with me while I do.";
        }
    }


    //TODO:
    //Probably would like to make a plugin method for when the battery is dead. I will come back in later to write it

}
