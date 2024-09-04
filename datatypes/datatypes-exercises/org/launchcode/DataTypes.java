package org.launchcode;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        float length;
        float width;
        float areaOfRectangle;
        Scanner inputLength;

        inputLength = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = inputLength.nextFloat();

        Scanner inputWidth;
        inputWidth = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = inputWidth.nextFloat();

        inputLength.close();
        inputWidth.close();

        areaOfRectangle = (length * width);
        System.out.println("The area of the rectangle is " + areaOfRectangle);

    }
}
