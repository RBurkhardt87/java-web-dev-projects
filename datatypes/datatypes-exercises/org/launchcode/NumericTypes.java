package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main (String[] args) {
        float miles;
        float gas;
        float mpg;
        Scanner inputMiles;
        Scanner inputGas;

        inputMiles = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = inputMiles.nextFloat();

        inputGas = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used? ");
        gas = inputGas.nextFloat();

        inputGas.close();
        inputMiles.close();

        mpg = (miles / gas);
        System.out.println("Your miles-per-gallon: " + mpg);


    }
}
