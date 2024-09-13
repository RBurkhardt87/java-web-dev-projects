package org.launchcode;

import java.time.LocalDate;


/*
The MenuItem class should primarily be responsible for encapsulating
the properties and behaviors of individual menu items,
not for handling collections or their organization.
*/

public class MenuItem {

    //TODO: Declare fields for objects of MenuItem Class (Private for best practice)
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private LocalDate dateAdded;


    //TODO: Create constructor for objects of MenuItem Class (Private vs Public???)
    MenuItem(String name, double price, String description, String category, boolean isNew, LocalDate dateAdded){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }


    //TODO: Create Getters for fields (Public? So others can retrieve/modify private fields)
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public boolean getIsNew(){
        return isNew;
    }

    public LocalDate getDateAdded(){
        return dateAdded;
    }


    //TODO: Create Setters for the fields (Public? So others can retrieve/modify private fields)
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }

    public void setDateAdded(LocalDate dateAdded){
        this.dateAdded = dateAdded;
    }


}
