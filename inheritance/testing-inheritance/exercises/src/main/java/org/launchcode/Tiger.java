package org.launchcode;

public class Tiger extends AbstractCat {

    private String name;
    private String species = "Felis catus";

    public Tiger(double aWeight, String aName) {
        super(aWeight);
        name = aName;
    }

    public String noise() {
        return "Rrraaarr!";
    }

    //So, I got a message saying that I couldn't extend AbstractCat unless
    //I created a noise() for Tiger. Seems like by doing an abstract parent
    //class it makes you create personal instance methods for your subclasses
    //and doesn't allow you to make instances of the Parent class itself.

    //The fields/variables/props all still get inherited for use.
    //Concrete methods are still used as they are, only the abstract ones
    //require you to make specific code to carryout for each subclass.
}
