package org.launchcode;

public class Movie {

    //TODO: Declare fields <--- would those be final???
    private final String name;
    private final double length;

    //TODO: Create Constructor
    public Movie(String name, double length) {
        this.name = name;
        this.length = length;
    }

    //TODO: Create Getters (No Setters since they are final)
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }


}
