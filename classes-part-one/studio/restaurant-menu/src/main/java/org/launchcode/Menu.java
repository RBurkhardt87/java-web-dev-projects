package org.launchcode;

import java.awt.MenuItem;
import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {

    //TODO: Create last update for the menu
    private LocalDate lastUpdated;


    //TODO: Create an arrayList that will hold the menu items (Private or Public???)
    //The type of these ArrayLists are 'MenuItem' because they are menuItem object types.
    //So, the ArrayLists will hold objects of the MenuItem class.
    private ArrayList<MenuItem> menuItems = new ArrayList<>();




    //-----------------THESE ARE JUST SOME IDEAS ON WHERE TO GO WITH EVERYTHING -----------------------------------//
    // ----------------VERY POSSIBLE THESE THINGS WILL TAKE PLACE SOMEWHERE ELSE-----------------------------------//



    //TODO: Create an ArrayList for apps (Private or Public???)
    private ArrayList<MenuItem> appetizers = new ArrayList<>();


    //TODO: Create an ArrayList for main meals (Private or Public???)
    private ArrayList<MenuItem> entrees = new ArrayList<>();


    //TODO: Create an ArrayList for desserts (Private or Public???)
    private ArrayList<MenuItem> desserts = new ArrayList<>();




    //TODO: Figure out what is wrong with how I am creating a menu item with args
    //Could it be because it needs to be instantiated in the Main Class instead??? Something to do with Static???
    //MenuItem tomatoSoupCup = new MenuItem();
    //MenuItem tomatoSoupCup = new MenuItem("Tomato Soup Cup", 5.99, "Creamy Tomato-based soup", "appetizers", true, 2024-09-12);

    //TODO: Instantiate each menu item to populate the 'menuItems' ArrayList
    //Parameters: double price, String description, String category, boolean isNew, LocalDate dateAdded
    //EX: MenuItem tomatoSoupCup = new MenuItem(String "Tomato Soup Cup", double 5.99, String "Creamy Tomato-based soup", String "appetizers", boolean true, LocalDate 9/12/2024);
    //This creates an instance (tomatoSoupCup) of the MenuItem Class.

    //TODO: Think over this idea/concept:
    //The description might be a lot to pass in as an argument. Maybe leave this parameter out (or create another constructor
    //that doesn't need to take it),but keep it in the constructor so we could add the value by just ...
    //tomatoSoupCup.description = "Creamy Tomato-based soup";




    //TODO: Create a for-each loop that will iterate over the 'menuItems' ArrayList
    //It will contain a conditional that checks the value of category, and then, puts
    //that menu item in the correct ArrayList


    //TODO: Create a loop the will iterate over 'appetizer' ArrayList and print each item and its values
    //It will print the item name, price, description
    //Loop will need a condition that prints "NEW" if isNew returns true


    //TODO: Create a loop the will iterate over 'entrees' ArrayList and print each item and its values
    //It will print the item name, price, description
    //Loop will need a condition that prints "NEW" if isNew returns true


    //TODO: Create a loop the will iterate over 'desserts' ArrayList and print each item and its values
    //It will print the item name, price, description
    //Loop will need a condition that prints "NEW" if isNew returns true


}

