package org.launchcode;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create 5 menu items in different categories:
        //public MenuItem(String name, double price, String description, String category, boolean isNew)

        MenuItem item1 = new MenuItem("Blackened Ahi Tuna Fajitas", 21.99, "Tuna is pan seared and served rare with sizzing veggies!", "entree");
        MenuItem item2 = new MenuItem("Shrimp Voodo", 18.99, "Lightly battered shrimp tossed in our spicy voodoo sauce", "appetizer");
        MenuItem item3 = new MenuItem("Fried Alligator", 17.99, "Bite size pieces of Louisana Fried Alligator", "appetizer");
        MenuItem item4 = new MenuItem("Bread Pudding", 8.99, "Bread pudding served with a whiskey butter sauce and whipped cream", "dessert");
        MenuItem item5 = new MenuItem("Red Beans and Rice", 12.99, "Smoked Tasso, Anodouille Sausage, Bacon cooked in a Red Bean Stew with Rice", "entree");


        System.out.println(item1.isNew());

        //Print first item:
        System.out.println(item1);

        //TODO: Create a menu
        Menu menu = new Menu();

        //TODO: Add items to the Menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        //TODO: Remove an item from menu
        menu.removeItem(item1);

        System.out.println(menu);
    }


}
