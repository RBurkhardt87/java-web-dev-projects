//package technology;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class Program {
//    public static void main(String[] args) {
//
//
//
//        //TODO: INSTANTIATE A COMPUTER OBJECT
//        Computer myComp = new Computer("Lenovo", 2024, "Dark Mode");
//
//        //TODO: PRINT OUT VALUES OF OBJECT
//        System.out.println(myComp.getBrand());
//        System.out.println(myComp.getYear());
//        System.out.println(myComp.getScreenMode());
//
//        //TODO: USE THE METHODS ON THE OBJECT
//        System.out.println(myComp.isNew());
//        myComp.powerOn();
//
//
//
//        //TODO: TRY AN OBJECT THAT WILL BE FALSE WHEN isNew() is called
//        Computer oldComp = new Computer("Microsoft Surface Pro", 2015, "Light Mode");
//
//        System.out.println(oldComp.getBrand());
//        System.out.println(oldComp.getYear());
//        System.out.println(oldComp.getScreenMode());
//
//        System.out.println(oldComp.isNew());
//        oldComp.powerOn();
//
//
//
//        //TODO: INSTANTIATE A LAPTOP OBJECT
//        Laptop myLaptop = new Laptop("Mac Book", 2017, "Light Mode");
//
//        //TODO:PRINT OUT VALUES OF OBJECT
//        System.out.println(myLaptop.getBrand());
//        System.out.println(myLaptop.getYear());
//        System.out.println(myLaptop.getScreenMode());
//
//        System.out.println(myLaptop.isCharged());
//
//        //TODO: USE METHODS ON THE OBJECT
//        System.out.println(myLaptop.checkBatteryLevel());
//        System.out.println(myLaptop.doHomework());
//        System.out.println(myLaptop.checkBatteryLevel());
//
//        System.out.println("\n\t\tCheck if Computer Methods work on Laptop Objects");
//
//        myLaptop.powerOn();
//        System.out.println("Checking if " + myLaptop.getBrand() + " is new: " + myLaptop.isNew());
//
//
//        //Ariel showed us how to do a Java "template literal" during Datatype Studio
//        //System.out.println(String.format("The area of a circle of radius %s is : %s ", radius, areaOfCircle));
//
//
//        //TODO: INSTANTIATE A SMARTPHONE OBJECT
//        SmartPhone myPhone = new SmartPhone("Galaxy Note", 2019, "Harry Potter Theme", "T-Mobile");
//
//        //TODO: PRINT OUT VALUES OF OBJECT
//        System.out.println();
//        System.out.printf("This phone is a %s %s %s phone that's decked out in a %s %n",
//                myPhone.getYear(), myPhone.getBrand(), myPhone.getProvider(), myPhone.getScreenMode());
//
////        System.out.println(myPhone.getBrand());
////        System.out.println(myPhone.getYear());
////        System.out.println(myPhone.getScreenMode());
////        System.out.println(myPhone.getProvider());
//
//        //TODO: USE COMPUTER CLASS METHODS ON SMARTPHONE
//        System.out.println("\n\t\tCheck if Computer Methods work on SmartPhone Objects: ");
//        System.out.println("\nChecking if " + myPhone.getBrand() + " is new: " + myPhone.isNew());
//
//        System.out.println("\n\t\tCheck if the SmartPhone Override of powerOn() method works: ");
//        myPhone.powerOn();
//
//
//        //TODO: USE METHODS ON THE OBJECT
//        System.out.println();
//        System.out.println("\n\t\tLET'S CHECK OUT HOW THE sendText() METHOD WORKS: \n");
//        myPhone.sendText();
//
//        System.out.println("\nDid the message send: " + myPhone.getDelivered());
//
//
//        //TODO:
//        //Now that I know everything is functioning properly. I could actually write a program with a little more
//        //cohesiveness rather than just testing... I guess I could have just written unit test to make sure things
//        //were working as expected. Next Time!
//
//
//    }
//}
