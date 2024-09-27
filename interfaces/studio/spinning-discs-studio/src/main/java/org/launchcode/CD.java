package org.launchcode;


import java.util.HashMap;

// TODO: Implement your custom interface.
public class CD extends BaseDisc implements OpticalDisc{


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones need to be declared separately
    //THESE SHOULD PROBABLY GO IN BASEDISC... Let's see if I can get it to work first from here
    private boolean loaded = false;
    private boolean playing = false;
    private boolean spinning = false;


    //TODO: Create Constructor
    public CD(String name, String discType, double usedCapacity, HashMap<String, Double> contents) {
        super(name, discType, usedCapacity, contents);
        this.setMaxCapacityMins(80);
    }

    //TODO: Create a second constructor that you can create an empty CD
    public CD(String discType){
        super(discType);
        this.setMaxCapacityMins(80);
    }

    //TODO: Add getters for the fields listed... no, setters because they are "switches" in the methods
    public boolean isLoaded() {
        return loaded;
    }

    public boolean isPlaying() {
        return playing;
    }

    public boolean isSpinning() {
        return spinning;
    }



    //I FEEL LIKE ALL THESE (BELOW) COULD HAVE BEEN IN THE ABSTRACT CLASS AND JUST USE THE GETTERS TO REPLACE CD WITH DVD, BUT THEY ARE HERE FOR NOW...



    //TODO: Implement spinDisk()
    //Could have been a method in abstract, and then just use .getDiscType() + " is loading..."
    @Override
    public void spinDisc() {
        System.out.println("CD is loading...");
        spinning = true;

    }

    //TODO: Implement readDisk()
    @Override
    public void readDisc() {
        if (spinning) {
            System.out.println("CD is loaded...");
            loaded = true;
        } else {
            System.out.println("Error, try inserting CD back into player...");
        }
    }

    //TODO: Implement pauseDisk()
    @Override
    public void pauseDisk() {
        if (playing) {
            System.out.println("Song paused...");
        } else {
            System.out.println("Must hit 'PLAY'");
        }
    }

    //TODO: Implement playDisc()
    @Override
    public void playDisc() {
        if(loaded) {
            System.out.println("Song is playing");
            playing = true;
        } else {
            System.out.println("CD is not loaded yet...");
        }


    }
}
