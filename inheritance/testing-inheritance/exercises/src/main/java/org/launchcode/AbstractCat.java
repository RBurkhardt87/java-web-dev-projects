package org.launchcode;

public abstract class AbstractCat {

    //First add 'abstract' into the class declaration (see above)

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;



    private String family = "Felidae";


    public AbstractCat (double aWeight) {
        weight = aWeight;
    }



    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    public String getFamily() {
        return family;
    }


    /**** Instance Methods ****/


    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }



    //Turned into a abstract method
    public abstract String noise ();
}
