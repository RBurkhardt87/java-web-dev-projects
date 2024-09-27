package org.launchcode;

import java.sql.SQLOutput;
import java.util.*;

public abstract class BaseDisc {

    //TODO: Declare fields
    private String name;
    private double usedCapacity;
    private double maxCapacityMins;
    private HashMap<String, Double> contents;
    private String discType;


    //TODO: Create Constructor
    public BaseDisc(String name, String discType, double usedCapacity, HashMap<String, Double> contents) {
        this.name = name;
        this.usedCapacity = usedCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    //TODO: Second constructor for blank discs
    public BaseDisc(String discType) {
        this.discType = discType;
        this.name = "blank";
    }

    //TODO: Create Getters/Setters
    public String getName() {
        return name;
    }

    public double getUsedCapacity() {
        return usedCapacity;
    }

    public HashMap<String, Double> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsedCapacity(double usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public void setContents(HashMap<String, Double> contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getMaxCapacityMins() {
        return maxCapacityMins;
    }

    public void setMaxCapacityMins(double maxCapacityMins) {
        this.maxCapacityMins = maxCapacityMins;
    }



    //TODO: Write burnDisc() method         <--- How can I update a name to the cd after it is burned?
    //Will take in a HashMap as the data being "burned"
    //Will have conditional to make sure that there's enough storage capacity
    //I'M WONDERING IF MAYBE HOW I AM "PUTTING" KEY/VALUE PAIRS INTO HASHMAP IN MAIN SHOULD BE THIS METHOD...
    //----> burnDisk() now takes a blank CD and updates capacity to that of the data being "burned"
    //CAN I ACCESS A NAME TO ADD TO THE BLANK DISC ONCE BURNED? NOT SURE IF/HOW I CAN GET THE HASHMAP NAME TO UPDATE   <--------
    public void burnDisc(HashMap<String, Double> hashMap) {
        if (checkDataSize(hashMap) > getMaxCapacityMins() ) {
            System.out.println("Not enough storage available.");
        } else {
            System.out.println("Burn disc is complete!");
            this.usedCapacity = checkDataSize(hashMap);
        }
    }


    //TODO: Write writeOnBurnedCopy()
    //IF I CAN'T UPDATE THE NAME OF THE BLANK CD WITH THE HASHMAP NAME, COULD I WRITE A METHOD FOR IT INSTEAD <-------
    //Could I check if the blank cd now has usedCapacity, and if so, then I could write/assign a name to the CD...IDK...I'm tired :(
//    public void writeOnBurnedCopy(){
//        if ( )
//    }


    //TODO: Write checkDataSize() method to calculate storage space being used
    //It will return the values (data size) of all maps and return total data usage
    public double checkDataSize(HashMap<String, Double> hashMap) {
        double countSize = 0;
        for (Double value : hashMap.values()) {
            countSize += value;
        }
        return countSize;
    }



    //TODO: Write a getDiscography() method <--- maybe this should go inside CD Class instead (just have discInformation here)
    //Will display to the user description of disc
    //THE PROBLEM WITH THIS, THE FOR EACH LOOP DOESN'T PRINT IN ORDER.     <------ *** FIX ***
    public void getDiscography(HashMap<String,Double> album){
        String newline = System.lineSeparator();
        discInformation(album);
        System.out.println("DISCOGRAPHY: ");
        for(String key : album.keySet()) {
            System.out.println(key + " : " + album.get(key));
        }
    }

    //TODO: Write discInformation (it will be called inside getDiscography())
    public void discInformation(HashMap<String, Double> album){
        String newline = System.lineSeparator();
        System.out.println("DISC INFORMATION: " + newline +
                "Name: " + getName() + newline +
                "Length: " + getUsedCapacity() + newline +
                "Disc Type: " + getDiscType() + newline);
    }



    //TODO: Write skip() method
    //You can skip to next songs, or movie chapters (skip to new HashMap objects)
    //LOOK UP HOW I COULD DO THIS... WOULD A LOOP WORK?
    //WAS GOING TO HAVE USER INPUT HERE, BUT WILL JUST HAVE IT JUMP TO NEXT HASMAP IF POSSIBLE FOR CD, NOT SURE HOW I WOULD DO THIS FOR DVD YET.
    //WOULD HAVE TO OVERRIDE IT FOR DVD/CD IF I MADE METHOD APART OF THE ABSTRACT CLASS
    public void skipToNext(){}




    //TODO: Write a storeData() method <--- I don't see much difference than burn (ESPECIALLY IF I PUT THE ELEMENTS/SONGS IN THE HASHMAP IN BURN METHOD)
    //Maybe write the elements being put() into hashmap here and then call this method inside burn
}
