package org.launchcode;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";


    //Constructor with 2 args
    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    //Constructor with 1 arg:
    public HouseCat(String aName){
        name = aName;
    }



    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }


    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}