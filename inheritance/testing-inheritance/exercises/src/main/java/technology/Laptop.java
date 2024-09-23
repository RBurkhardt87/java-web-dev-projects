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

    //Do I actually need this setter? I only want to change the charge when doHomework method is called.
    //And when I create a plugIn method I will set it back to true. Doesn't seem like I would want this setter here.
    //If someone changed the value, would it impact my methods? Think on how the code could be jeopardized or would it even matter.
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
    //Probably would like to make a plugin method for when the battery is dead. I will come back in later to write it <---I would want it for smartphone too
    //So, should I make it something in Computer to be inherited by both, or does it matter if they have their own methods? Best practice?
    //I will write unit test for this method to check if it works instead of in the main program

}
