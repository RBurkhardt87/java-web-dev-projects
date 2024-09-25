package technology;

import java.sql.SQLOutput;

public class RunProgram {
    public static void main(String[] args) {

        //TODO: instantiate a SmartPhone object
        SmartPhone choPhone = new SmartPhone("Galaxy Note", 2019, "Harry Potter Theme", "T-Mobile");

        choPhone.powerOn();

        choPhone.sendText();


        System.out.println();
        System.out.println();

        //TODO: instantiate a Laptop object
        Laptop myLapTop = new Laptop("Lenovo", 2024, "Dark Mode");

        myLapTop.powerOn();
        System.out.println();
        System.out.println("CHECK BATTERY LEVEL: ");
        System.out.println(myLapTop.checkBatteryLevel());
        System.out.println();
        System.out.println("CHECK IF I USED IT TO DO HOMEWORK: ");
        System.out.println(myLapTop.doHomework());
        System.out.println();
        System.out.println("CHECK THE BATTERY LEVEL AFTER DOING HOMEWORK: ");
        System.out.println(myLapTop.checkBatteryLevel());

        Computer myComp = new Computer("Acer", 1998, "Light Mode");
        Computer yourComp = new Computer("HP", 1999, "Light Mode");
        SmartPhone phone = new SmartPhone("LG", 2021, "Dark Mode", "Verizon");
        Laptop laptop = new Laptop("Surface Pro", 2015, "Light Mode");
        System.out.println("Comp 1: " + myComp.objectId());
        System.out.println("Comp 2: " + yourComp.objectId());
        System.out.println("Phone 1: " + choPhone.objectId());
        System.out.println("Phone 2: " + phone.objectId());
        System.out.println("Laptop 1: " + myLapTop.objectId());
        System.out.println("Laptop 2: " + laptop.objectId());


    }
}
