package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Basic Solution updated with the use of the Circle Method
//        System.out.println("Enter the radius of a circle: ");
//        double radius = input.nextDouble();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of the circle of radius " + radius + " is: " + area);


//Do not need this math here anymore since I created a method in Circle that does the calculations
//        double areaOfCircle = 3.14 * radius * radius;
//        System.out.println(String.format("The area of a circle of radius %s is : %s ", radius, areaOfCircle));




//BONUS MISSION 1: First checking for a valid number and then checking to make sure it is positive:

        System.out.println("Enter the radius of a circle: ");

        //In the if statement, it is making sure that once the input is given, it is checked to be a double
        //This check is written before the input is actually captured in "radius", which happens in the line below

        if(input.hasNextDouble()){
            double radius = input.nextDouble();


        //Next we are going to see if the input is greater than 0, if it is, let's go a head and run the getArea method.
        //If it is not, then we need to prompt the user for accurate/valid input.
        //NOTE: We know input type is double because the if statement checked for valid data type. We are just nesting another condition

            if(radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of the circle of radius " + radius + " is: " + area);
            } else {
                System.out.println("Sorry, the radius must be a positive number.");
            }


        //This is the else block of the very first if statement that is checking for valid input type. If it is not a double type, then
        //we will prompt the user to enter correct input type.
        } else {
            System.out.println("Sorry, that was not a valid number.");
        }

//ENDS BONUS MISSION 1 : it validates the input, but it does not give the user an opportunity to correct their input. Instead, you have
//to rerun the program each time... so we need to try it in loop form.



//BONUS MISSION 2: Do-While Loop

        //First, we must declare are radius variable above the do-while loop to make sure it is in scope

        double radius;

        //In our do-while loop, we want the user to always be prompted on a loop. So we will make our prompt relate to what
        //condition will be set in our while. In this case, we only want it to loop if the number still isn't positive. So, we
        //set our prompt to tell user to enter a positive number, and we set our while to return true if the radius is less
        //than 0 (so it is checking to see if the number is negative, if so, loop again until it becomes false and number is indeed
        //a positive number. Once positive, you can stop looping.)

        do {
            System.out.println("Please enter a positive number for the radius: ");

            //We are going to nest a while loop inside our do-while loop to check that it is the correct data type.
            //The condition is saying, while input it NOT a double (due to the bang in front) prompt the user again.
            //So, if it is not the correct type (double) then prompt user to try again...It is a preemptive approach where
            //we validate first, before we even store the user input.

            while (!input.hasNextDouble()){
                System.out.println("Sorry. Radius must be a valid number. Please try again!");

                //input.next();   allows it to loop over and over again with user input until the while condition finally
                //returns false because the user entered the correct data type. At which point, the while loop is exited out
                //and the user input is then stored after the loop ends below... it seems like the input.next() is there to
                //take care of the wrong input from user. You have to deal with user input somehow.

                input.next();
            }

            //The loop has been exited because the user entered correct data type, code resumes, and the user input is then
            //stored inside the radius variable

            radius = input.nextDouble();

        } while(radius < 0);

        //Once the radius has been set with correct data type, it will go through the do-while loop until the condition returns false
        //at which point, our validation of input is complete, and we can now use the radius to do our calculations.

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle of radius " + radius + " is: " + area);






    input.close();
    }
}
