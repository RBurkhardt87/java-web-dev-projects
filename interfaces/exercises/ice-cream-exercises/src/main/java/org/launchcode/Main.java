package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Comparator comparator = new FlavorComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("BEFORE: ");
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }



        flavors.sort(comparator);
        //flavors.sort(new FlavorComparator());    <---- this is doing the same thing as line 12 and 16 together

        System.out.println("\nAFTER:");
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("\nBEFORE: ");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        //TODO: NEED TO CREATE AN INSTANCE OF THE COMPARATOR CLASS TO BE ABLE TO USE IT
        cones.sort(new ConeComparator());

        System.out.println("\nAFTER: ");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}