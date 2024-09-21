package org.launchcode;

public class Cat {

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;




    // The biological family for all cat species
    //TODO: Question:
    //Why isn't 'family' a static variable if it represents the biological
    //family of ALL cats? Instead it looks like an instance variable, but we
    //don't want each object to have their own biological family-- we want them
    //to share the same family across all instances of Cat.
    private String family = "Felidae";

    //The 'family' is not directly accessible by HouseCat (subclass/child), but
    //we can access it by using getters --->
    // public String getFamily() {
    //        return family;
    //    }

    //We do not create a setter for 'family' because we only want to be able
    //to change it within the Cat class. We don't want a subclass to change the
    //biological family of its parent class.



    //This is the constructor for making an object of the Cat Class(1 arg):
    public Cat (double aWeight) {
        weight = aWeight;
    }


    //TODO:MAKE A NO-ARG CONSTRUCTOR FOR CAT:
    public Cat(){
        weight = 13;
    }

    /**** Getters and Setters ****/

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



    //Method to learn about OVERRIDE
    public String noise () {
        return "Meeeeeeooooowww!";
    }
}