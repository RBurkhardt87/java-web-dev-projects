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


    //TODO: Create a getter() method to retrieve elements from the ArrayList
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }



    //TODO: adding an item to the menu
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        this.lastUpdated = LocalDate.now();
    }


    //TODO: removing an item from the menu
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        this.lastUpdated = LocalDate.now();
    }


    //TODO: Define custom toString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem menuItem: menuItems) {
            if (menuItem.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(menuItem.toString()).append("\n");
            }
        }
        StringBuilder entrees = new StringBuilder();
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCategory().equals("entree")) {
                entrees.append("\n").append(menuItem.toString()).append("\n");
            }

        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCategory().equals("desserts")) {
                desserts.append("\n").append(menuItem.toString()).append("\n");
            }

        }


        return "\nCajun Spice\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "ENTREES" + entrees.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }
}

